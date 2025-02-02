SELECT id  
FROM (  
    SELECT id,  
           recordDate,  
           temperature,  
           LAG(temperature) OVER (ORDER BY recordDate) AS previousTemperature,  
           LAG(recordDate) OVER (ORDER BY recordDate) AS previousRecordDate  
    FROM Weather  
) AS derived  
WHERE DATEDIFF(recordDate, previousRecordDate) = 1  
AND temperature > previousTemperature;