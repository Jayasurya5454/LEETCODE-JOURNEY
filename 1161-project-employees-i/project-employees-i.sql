SELECT DISTINCT(Project_id),ROUND(AVG(experience_years) ,2)AS average_years
from Project p JOIN Employee e ON p.employee_id=e.employee_id
Group by p.project_id;