--CREATE ROLE parkbitch WITH login PASSWORD 'Test123';

GRANT SELECT 
ON Dogs_view 
TO parkbitch;

GRANT SELECT 
ON Cats_view 
TO parkbitch;

GRANT SELECT 
ON Pets_view 
TO parkbitch;

GRANT ALL 
ON PROCEDURE insert_pet(new_name varchar, new_age int, new_cvr int)
TO parkbitch;

GRANT ALL 
ON PROCEDURE insert_cat(new_name varchar, new_age int, new_cvr int, new_life_count int) 
TO parkbitch;

GRANT ALL 
ON PROCEDURE insert_dog(new_name varchar, new_age int, new_cvr int, new_bark_pitch char(2))
TO parkbitch;

