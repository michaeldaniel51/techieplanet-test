SELECT userId, AVG(duration) AS AverageDuration
FROM sessions
GROUP BY userId
HAVING COUNT(*) > 1;

-- We use GROUP BY userId to gather all sessions for each user.
-- AVG(duration) calculates the average duration for each user.
-- HAVING COUNT(*) > 1 filters to show only users who have more than one session.