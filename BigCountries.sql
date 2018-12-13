# Write your MySQL query statement below
SELECT name,population,area
FROM
(
SELECT *
FROM World
WHERE area > 3000000 OR population > 25000000
)a
