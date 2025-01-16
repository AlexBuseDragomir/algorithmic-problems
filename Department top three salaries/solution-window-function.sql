SELECT 
d.name AS 'Department', 
r.rankedEmployee AS 'Employee', 
r.rankedSalary AS 'Salary'
FROM (
    SELECT 
        e.name AS 'rankedEmployee', 
        e.salary AS 'rankedSalary', 
        e.departmentId AS 'rankedDepartmentId',
        DENSE_RANK() OVER (PARTITION BY departmentId ORDER BY salary DESC) AS 'rank'
    FROM Employee e
) r
inner join Department d on r.rankedDepartmentId = d.id
WHERE `rank` < 4