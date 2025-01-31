# **SQL Prep**
## Key points
- Table: a collection of related data entries made of fields(columns) and records(rows).
- Field: column in a table to maintain specific information about every record in a table.
- Record: Horizontal entity in a table. A row of each entry that exists in a table.
- SQL INSERTS, UPDATES, & DELETES records in a table
- Semicolons are used to seperate each statement in a database that allows for multiple statements
- ORDER BY has a default of ascending if you dont clarify which you want
- For string values we use single apostrophies (City = 'London') but for numerical values we just use the numbers (Price=3)
- OR vs AND: OR operator displays if *any* conditions are TRUE. AND operator displays if *all* conditions are TRUE
- With the **INSERT INTO** operator, the ID value does not need to be passed in as it increments itself
   -  It is possible to insert data in specific columns, it just adds a record with only the values in the columns you provided.
   -  It is also possible to insert multiple records into a table at one time, just seperate with a coma
   -       SYNTAX:
           INSERT INTO table_name
           VALUES (values1, values2,values3,...),
           VALUES (values1, values2,values3,...),
           VALUES (values1, values2,values3,...);
- A **NULL** Value is a value that has been left black and has no value.
  - We use the IS NULL or IS NOT NULL operators to test for NULL values
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
- **SELECT COUNT(DISTINCT  *FIELD_NAME*)**: Returns the numbe of a different records in a field
- **WHERE**: Gets only records of those requested'
-           Ex:
                  SELECT * FROM Company
                  WHERE City = 'London';
- **ORDER BY**: Sorts results set in ascending or descending order
-         SYNTAX:
            SELECT * FROM Company
            ORDER BY Price DESC;

-           SELECT * FROM Customer
           ORDER BY Price DESC, CustomerName ASC;
 **AND** : Used to filter records based on more than one condition
-   SELECT * FROM Customer
-   WHERE Price = 3 AND CustomerName LIKE 'G%';
   **OR** : Used to filter records based on more than one condition
-   ex:
-         SELECT * FROM Customers
          WHERE COUNTRY = 'Spain' OR COUNTRY = 'GERMANY';
 **NOT**: Is used in combination to other operators to give the opposite result. Called the negative result.
-         SELECT * FROM Customers
          WHERE NOT City = 'London';
 **NOT LIKE**: Get values that does not start with the given letter or pattern
-         SELECT * FROM Customers
          WHERE CustomerName NOT LIKE 'A%'
 **NOT BETWEEN**: Return values not between a given value
-         SELECT * FROM Customers
          WHERE Price NOT BETWEEN 10 AND 100;
**NOT IN**: Return values not in a certain field
-        SELECT * FROM Customers
         WHERE City NOT IN ('London', 'Berlin');
**NOT GREATER THAN**: Return values not greater than a certain value
-        SELECT * FROM Customers
         WHERE NOT Price > 50;
**NOT LESS THAN**: Return value not less than certain value
-        SELECT * FROM Customers
          WHERE NOT CustomerID < 14;
**INSERT INTO**: used to insert new records into a table
-     SYNTAX #1: Specify the columns and values to be added
          INSERT INTO table_name (column1, column2,...)
          VALUES (values1, values2,...);
-      SYNTAX #2: When adding to every column Ensure the order follow the column order if not specifying the columns to add to.
          INSERT INTO table_name
           VALUES (values1, values2,values3,...)
- A **NULL** Value is a value that has been left black and has no value.
-            SYNTAX 1:
                SELECT * FROM Customers
                WHERE CustomerName IS NOT NULL;
-            SYNTAX 2:
                SELECT * FROM Customers
                WHERE Country IS NULL;
