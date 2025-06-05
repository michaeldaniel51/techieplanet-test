SELECT g.yr, c.country
FROM games g
JOIN city c ON g.city = c.name;

--We're joining the games table with the city table using the city name.
--The games table has the year and city, and the city table tells us which country that city is in.
--So by joining them, we can get the year and the country where the games happened.