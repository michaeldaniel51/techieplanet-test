--  use distinct to removes duplicate sorts salaries from high to low,
 -- skips the first using offset then returns just 1 row
SELECT DISTINCT(salary) FROM emp ORDER BY salary DESC LIMIT 1 OFFSET 1;


-- first get the max salary then look for the salaries less than the max then get the max of it
SELECT MAX(salary) FROM emp WHERE salary < (SELECT MAX(salary) FROM emp);

--  picks the top 2 distinct salaries 100 and 80,then reorders those in descending 80,100
-- then takes the first one, which is 80
SELECT salary FROM (
  SELECT DISTINCT salary FROM emp ORDER BY salary DESC LIMIT 2
) AS emp ORDER BY salary LIMIT 1;

-- first gets the 2 top salaries might be 100,100 or 100,80
-- results may varies due to what it gets
-- there's only one number, so sorting and picking 1 might give 100, not 80
SELECT DISTINCT salary FROM (
  SELECT salary FROM emp ORDER BY salary DESC LIMIT 2
) AS emp ORDER BY salary LIMIT 1;
