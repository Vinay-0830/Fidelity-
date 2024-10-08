
CREATE TABLE Customers (
    CustomerID INT PRIMARY KEY,
    CompanyName VARCHAR(255) NOT NULL,
    City VARCHAR(25),
    Country VARCHAR(10) DEFAULT 'Canada'
);

CREATE TABLE Shippers (
    ShipperID INT PRIMARY KEY,
    CompanyName VARCHAR(25) NOT NULL UNIQUE
);

CREATE TABLE Products (
    ProductID INT PRIMARY KEY,
    CategoryID INT,
    ProductName VARCHAR(25) NOT NULL,
    UnitPrice DECIMAL(10, 2)
);

CREATE TABLE Orders (
    OrderID INT PRIMARY KEY,
    CustomerID INT,
    EmployeeID INT,
    OrderDate DATE NOT NULL,
    ShippedDate DATE,
    CONSTRAINT fk_CustomerID FOREIGN KEY (CustomerID) REFERENCES Customers(CustomerID),
    CONSTRAINT chk_ShippedDate CHECK (ShippedDate > OrderDate)
);

CREATE TABLE tblOrderDetails (
    OrderID INT,
    ProductID INT,
    UnitPrice DECIMAL(10, 2),
    Quantity INT CHECK (Quantity > 10),
    PRIMARY KEY (OrderID, ProductID),
    CONSTRAINT fk_OrderID FOREIGN KEY (OrderID) REFERENCES tblOrders(OrderID),
    CONSTRAINT fk_ProductID FOREIGN KEY (ProductID) REFERENCES tblProducts(ProductID)
);

CREATE TABLE tblOrderDetails (
    OrderID INT,
    ProductID INT,
    UnitPrice DECIMAL(10, 2),
    Quantity INT CHECK (Quantity > 10),
    PRIMARY KEY (OrderID, ProductID),
    CONSTRAINT fk_OrderID FOREIGN KEY (OrderID) REFERENCES Orders(OrderID),
    CONSTRAINT fk_ProductID FOREIGN KEY (ProductID) REFERENCES Products(ProductID)
);

INSERT INTO Customers (CustomerID, CompanyName, City,country)
VALUES 
(1, 'Accenture', 'Bangalore','India'),
(2, 'KPMG', 'Bangalore','India'),
(3, 'Infosys', 'Pune','India');

INSERT INTO Shippers (ShipperID, CompanyName)
VALUES 
(1, 'Ekart Shipping'),
(2, 'Amazon Delivery'),
(3, 'Express Logistics');

INSERT INTO Products (ProductID, CategoryID, ProductName, UnitPrice)
VALUES 
(1, 101, 'Laptop', 150000),
(2, 102, 'Smartphone', 80000),
(3, 103, 'Home Theater', 5000);

INSERT INTO Orders (OrderID, CustomerID, EmployeeID, OrderDate, ShippedDate)
VALUES 
(1, 1, 1001, '2024-09-01', '2024-09-03'),
(2, 2, 1002, '2024-09-02', '2024-09-05'),
(3, 3, 1003, '2024-09-04', '2024-09-06');

INSERT INTO tblOrderDetails (OrderID, ProductID, UnitPrice, Quantity)
VALUES 
(1, 1, 150000, 12),
(1, 2, 80000, 15),
(2, 3, 50000, 11),
(3, 1, 150000, 13);

Select * from Orders;

Insert into Customers (CustomerID,companyname,city) values (4,'Fidelity','Boston')

select * from Customers

INSERT INTO tblOrderDetails (OrderID, ProductID, UnitPrice, Quantity)
VALUES (4, 2, 80000, 3);

INSERT INTO Shippers (ShipperID, CompanyName)
VALUES (4, 'Ekart Shipping');

INSERT INTO Orders (OrderID, CustomerID, EmployeeID, OrderDate, ShippedDate)
VALUES (4, 1, 1001, '2024-09-10', '2024-09-08'); 