-- Tạo bảng City
create table City(
    CityID int primary key not null,
    CityName varchar(30) not null
);

-- Tạo bảng Account
create table Account(
    UserName varchar(255) primary key not null,
    Password varchar(255) not null,
    CreationDate date not null,
    Location int not null,
    Authority varchar(10) not null,
    Status bit not null
);

-- Thêm ràng buộc cho bảng Account
alter table Account
    add constraint A_fk_Ci foreign key (Location)
        references City(CityID),
    add constraint A_Authority check (Authority in ('Admin', 'Manager', 'Customer')); 

-- Tạo bảng Branch
create table Branch(
    BranchID int primary key not null,
    BranchName varchar(255) not null,
    PhoneNumber char(10) not null,
    Email varchar(255) not null,
    UserName varchar(255) not null
);

-- Thêm ràng buộc cho bảng Branch
alter table Branch
    add constraint B_fk_A foreign key (UserName)
        references Account(UserName);

-- Tạo bảng Product
create table Product(
    ProductID varchar(255) primary key not null,
    ProductName varchar(255) not null,
    Brand varchar(255),
    ProductImage blob, 
    ProductSize int,
    Price int not null
);  

-- Thêm ràng buộc cho bảng Product
alter table Product
    add constraint P_Size check (ProductSize >= 10 AND ProductSize <= 60),
    add constraint P_Price check (Price > 0);

-- Tạo bảng ProductOfBranch
create table ProductOfBranch(
    ProductID varchar(255) not null,
    BranchID int not null,
    Quantity int not null,
    EntryDate date
);

-- Thêm ràng buộc cho bảng ProductOfBranch
alter table ProductOfBranch
    add constraint PB_pk primary key (ProductID, BranchID),
    add constraint PB_fk_P foreign key (ProductID)
        references Product(ProductID),
    add constraint PB_fk_B foreign key (BranchID)
        references Branch(BranchID),
    add constraint PB_Quantity check (Quantity >= 0); 

-- Tạo bảng Customer
create table Customer(
    CustomerID int AUTO_INCREMENT primary key not null,
    CustomerName varchar(255),
    Avatar blob,
    Gender bit,
    DateOfBirth date,
    Address varchar(255),
    PhoneNumber char(10),
    Email varchar(255),
    TotalPoint int default 100,
    UserName varchar(255) not null
)AUTO_INCREMENT = 1000;

-- Thêm ràng buộc cho bảng Customer
alter table Customer
    add constraint C_fk_A foreign key (UserName)
        references Account(UserName),
    add constraint C_TotalPoint check (TotalPoint >= 0);

-- Tạo bảng Cart
create table Cart(
    ProductID varchar(255) not null,
    CustomerID int not null,
    BranchID int not null
);

-- Thêm ràng buộc cho bảng Cart
alter table Cart
    add constraint Ca_pk primary key (ProductID, CustomerID, BranchID),
    add constraint Ca_fk_P foreign key (ProductID)
        references Product(ProductID),
    add constraint Ca_fk_C foreign key (CustomerID)
        references Customer(CustomerID),
    add constraint Ca_fk_B foreign key (BranchID)
        references Branch(BranchID);

-- Tạo bảng Voucher
create table Voucher(
    VoucherCode char(10) primary key not null,
    Detail varchar(255) not null,
    Discount int not null,
    PointChange int not null
);

-- Thêm ràng buộc cho bảng Voucher
alter table Voucher
    add constraint V_Discount check (Discount > 0 AND Discount <= 100),
    add constraint V_PointChange check (PointChange > 0);

-- Tạo bảng VoucherOfCustomer
create table VoucherOfCustomer(
    VoucherCode char(10) not null,
    CustomerID int not null,
    ExpirationDate date
);

-- Thêm ràng buộc cho bảng VoucherOfCustomer
alter table VoucherOfCustomer
    add constraint VC_pk primary key (VoucherCode, CustomerID),
    add constraint VC_fk_V foreign key (VoucherCode)
        references Voucher(VoucherCode),
    add constraint VC_fk_C foreign key (CustomerID)
        references Customer(CustomerID);

-- Tạo bảng Orders
create table Orders(
    OrderID int AUTO_INCREMENT primary key not null,
    CreationDate date not null,
    Status bit not null,
    CustomerID int,
    VoucherCode char(10)
)AUTO_INCREMENT = 100;

-- Thêm ràng buộc cho bảng Orders
alter table Orders
    add constraint O_fk_C foreign key (CustomerID)
        references Customer(CustomerID),
    add constraint O_fk_V foreign key (VoucherCode)
        references Voucher(VoucherCode);

-- Tạo bảng OrderDetail
create table OrderDetail(
    OrderID int not null,
    ProductID varchar(255) not null,
    BranchID int not null,
    Quantity int not null
);

-- Thêm ràng buộc cho bảng OrderDetail
alter table OrderDetail
    add constraint OD_pk primary key (OrderID, ProductID, BranchID),
    add constraint OD_fk_O foreign key (OrderID)
        references Orders(OrderID),
    add constraint OD_fk_P foreign key (ProductID)
        references Product(ProductID),
    add constraint OD_fk_B foreign key (BranchID)
        references Branch(BranchID),
    add constraint OD_Quantity check (Quantity > 0);

-- Chèn dữ liệu vào bảng City
insert into City (CityID, CityName)
values  (0, 'An Giang'),
        (1, 'Bà Rịa-Vũng Tàu'),
        (2, 'Bắc Giang');

-- Chèn dữ liệu vào bảng Account
insert into Account (UserName, PassWord, CreationDate, Location, Authority, Status)
values  ('abc', '123', '2023/12/18', 0, 'Admin', 1),
        ('def', '456', '2024/2/29', 2, 'Manager', 1),
        ('klm', '012', '2024/1/31', 0, 'Manager', 1),
        ('ghi', '789', '2020/1/31', 1, 'Customer', 1),
        ('nop', '345', '2023/6/12', 1, 'Customer', 1);

-- Chèn dữ liệu vào bảng Branch
insert into Branch (BranchID, BranchName, PhoneNumber, Email, UserName)
values  (1, 'Chi nhánh 1', '8596342345', 'cn1@gmail.com', 'def'),
        (2, 'Chi nhánh 2', '3769228364', 'cn2@gmail.com', 'klm');

-- Chèn dữ liệu vào bảng Product
insert into Product (ProductID, ProductName, Brand, ProductSize, Price)
values  ('qwertyuiop', 'Áo thun', 'Visual', 56, 120000),
        ('asdfghjklo', 'Quần bò', 'Basic', 33, 300000),
        ('zxcvbnmuty', 'Quần ngủ', 'Sơn Nội', 48, 450000),
        ('yhnurldnvg', 'Áo khoác', 'Chợ Thi', 50, 1600000);

-- Chèn dữ liệu vào bảng ProductOfBranch
insert into ProductOfBranch (ProductID, BranchID, Quantity, EntryDate)
values  ('qwertyuiop', 1, 36, '2024/1/12'),
        ('asdfghjklo', 1, 54, '2024/4/23'),
        ('zxcvbnmuty', 1, 60, '2024/3/13'),
        ('asdfghjklo', 2, 10, '2023/6/1'),
        ('yhnurldnvg', 2, 28, '2024/5/31');

-- Chèn dữ liệu vào bảng Customer
insert into Customer (CustomerName, UserName)
values  ('Lê Bá Tuân', 'ghi'),
        ('Nguyễn Thị Hạnh', 'nop');

-- Chèn dữ liệu vào bảng Cart
insert into Cart (ProductID, CustomerID, BranchID)
values  ('asdfghjklo', 1000, 1),
        ('zxcvbnmuty', 1000, 1),
        ('qwertyuiop', 1001, 1),
        ('yhnurldnvg', 1001, 2);

-- Chèn dữ liệu vào bảng Voucher
insert into Voucher (VoucherCode , Detail, Discount, PointChange)
values  ('qazwsxedcr', 'Giảm giá khi mua áo ', 10, 400),
        ('rfvtgbyhnu', 'Giảm giá khi mua quần', 34, 650);

-- Chèn dữ liệu vào bảng VoucherOfCustomer
insert into VoucherOfCustomer (VoucherCode, CustomerID)
values  ('qazwsxedcr', 1000),
        ('rfvtgbyhnu', 1000),
        ('rfvtgbyhnu', 1001);       

-- Chèn dữ liệu vào bảng Orders
insert into Orders (CreationDate, Status, CustomerID, VoucherCode)
values  ('2024/1/23', 1, 1000, 'qazwsxedcr'),
        ('2024/4/2', 0, 1000, null),
        ('2024/5/17', 0, 1000, 'rfvtgbyhnu'),
        ('2023/2/28', 0, 1001, null),
        ('2024/4/1', 1, 1001, 'rfvtgbyhnu');

-- Chèn dữ liệu vào bảng OrderDetail
insert into OrderDetail (OrderID, ProductID, BranchID, Quantity)
values  (100, 'qwertyuiop', 1, 1),
        (100, 'asdfghjklo', 1, 2),
        (101, 'qwertyuiop', 1, 4),
        (102, 'qwertyuiop', 2, 1),
        (102, 'asdfghjklo', 2, 1),
        (103, 'asdfghjklo', 2, 1),
        (103, 'yhnurldnvg', 2, 1),
        (104, 'asdfghjklo', 1, 1),
        (104, 'yhnurldnvg', 2, 1);