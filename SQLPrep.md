# **SQL Prep**
## Key points
- Table: a collection of related data entries made of fields(columns) and records(rows).
- Field: column in a table to maintain specific information about every record in a table.
- Record: Horizontal entity in a table. A row of each entry that exists in a table.
- SQL INSERTS, UPDATES, & DELETES records in a table
- Semicolons are used to seperate each statement in a database that allows for multiple statements
- ORDER BY has a default of ascending if you dont clarify which you want
- For string values we use single apostrophies (City = 'London') but for numerical values we just use the numbers (Price=3) 
## SQL Commands
- SELECT * FROM Customers: gets all the records in the Customers table
- SELECT: Extracts daa in a database
- UPDATE: Changes data in a database
- DELETE: Removes data from a database
- INSERT INTO: inserts new data into a db
- CREATE DATABASE: Creates a new database
- ALTER DATABASE: Modifies a database
- CREATE TABLE: Creates a new table
- ALTER TABLE: Modifies a table
- DROP TABLE: Deletes a table
- CREATE INDEX: Creates an Index/Search Key
- DROP INDEX: Deletes an Index/Search key
- SELECT DISTINCT: Returns only unique values
- SELECT COUNT(DISTINCT  *FIELD_NAME*): Returns the numbe of a different records in a field
- WHERE: Gets only records of those requested'
-   Ex:
-       SELECT * FROM Company
        WHERE City = 'London';
- ORDER BY: Sorts results set in ascending or descending order
- SYNTAX:
-    SELECT * FROM Company
-    ORDER BY Price DESC;

-   SELECT * FROM Customer
-   ORDER BY Price DESC, CustomerName ASC;
- AND : Used to filter records based on more than one condition
-   SELECT * FROM Customer
-   WHERE Price = 3 AND CustomerName LIKE 'G%';
