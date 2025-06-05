SELECT g.yr, g.city, c.country
FROM games g
LEFT JOIN city c ON g.city = c.name;

-- a left join returns all records from the left table games, and matching records from the right table city
--if there is no match, the right side columns will be null same goes for right join if no match the lest side will be null.