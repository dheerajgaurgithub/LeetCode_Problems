# Write your MySQL query statement below
SELECT Employee.name , Bonus.bonus from Employee
LEFT JOIN Bonus ON Employee.empId=Bonus.empId
WHERE bonus<1000 OR bonus is NULL