delete from Dogs; 
delete from Cats;
delete from Pets;
delete from Vets;
delete from caretakers;
delete from Cities; 

--Reset sequences
alter sequence caretakers_id_seq restart with 1;
alter sequence pets_id_seq restart with 1;

-- Cities
INSERT INTO Cities(zip_code, name) VALUES (8900, 'Randers');
INSERT INTO Cities(zip_code, name) VALUES (2800, 'Lyngby');


-- Vets
INSERT INTO Vets(cvr, name, street, zip_code) VALUES (51245812, 'Dr. Kock', 'vejvej 1', 8900);
INSERT INTO Vets(cvr, name, street, zip_code) VALUES (15478536, 'Dr. Hansen', 'gadegade 1', 2800);

-- Random Pets
insert into Pets (name, age, vet_cvr) values('Bo', 120, 15478536);
insert into Pets (name, age, vet_cvr) values('Hans', 5, 51245812);
insert into Pets (name, age, vet_cvr) values('Jytte', 7, 51245812);
insert into Pets (name, age, vet_cvr) values('Gert', 4, 15478536);


-- Dogs
with new_dog as (
insert into Pets (name, age, vet_cvr) values('Bella', 4, 15478536) returning id
)
insert into Dogs (id, bark_pitch) select id, 'a6' from new_dog;

with new_dog as (
insert into Pets (name, age, vet_cvr) values('Palle', 4, 15478536) returning id
)
insert into Dogs (id, bark_pitch) select id, 'a4' from new_dog;

with new_dog as (
insert into Pets (name, age, vet_cvr) values('Susi', 4, 15478536) returning id
)
insert into Dogs (id, bark_pitch) select id, 'a6' from new_dog;

with new_dog as (
insert into Pets (name, age, vet_cvr) values('Bruno', 4, 15478536) returning id
)
insert into Dogs (id, bark_pitch) select id, 'a4' from new_dog;

with new_dog as (
insert into Pets (name, age, vet_cvr) values('Bente', 4, 15478536) returning id
)
insert into Dogs (id, bark_pitch) select id, 'a6' from new_dog;

with new_dog as (
insert into Pets (name, age, vet_cvr) values('Lulu', 4, 15478536) returning id
)
insert into Dogs (id, bark_pitch) select id, 'a4' from new_dog;
with new_dog as (
insert into Pets (name, age, vet_cvr) values('Lucky', 4, 15478536) returning id
)
insert into Dogs (id, bark_pitch) select id, 'a6' from new_dog;

with new_dog as (
insert into Pets (name, age, vet_cvr) values('Sofus', 4, 15478536) returning id
)
insert into Dogs (id, bark_pitch) select id, 'a4' from new_dog;



-- Cats
with new_cat as (
insert into Pets (name, age, vet_cvr) values('Duchez', 4, 15478536) returning id
)
insert into Cats (id, life_count) select id, 9 from new_cat;

with new_cat as (
insert into Pets (name, age, vet_cvr) values('Pjuske', 4, 15478536) returning id
)
insert into Cats (id, life_count) select id, 9 from new_cat;

with new_cat as (
insert into Pets (name, age, vet_cvr) values('Tiger', 4, 15478536) returning id
)
insert into Cats (id, life_count) select id, 9 from new_cat;

with new_cat as (
insert into Pets (name, age, vet_cvr) values('Mis', 4, 15478536) returning id
)
insert into Cats (id, life_count) select id, 9 from new_cat;

with new_cat as (
insert into Pets (name, age, vet_cvr) values('Misser', 4, 15478536) returning id
)
insert into Cats (id, life_count) select id, 9 from new_cat;

with new_cat as (
insert into Pets (name, age, vet_cvr) values('Pusser', 4, 15478536) returning id
)
insert into Cats (id, life_count) select id, 9 from new_cat;


with new_cat as (
insert into Pets (name, age, vet_cvr) values('Malthe', 4, 15478536) returning id
)
insert into Cats (id, life_count) select id, 9 from new_cat;

with new_cat as (
insert into Pets (name, age, vet_cvr) values('Kat', 4, 15478536) returning id
)
insert into Cats (id, life_count) select id, 9 from new_cat;



-- Caretakers

insert into caretakers (name, street, zip_code) values('Sebastian', 'grønvej 1' , 8900);
insert into caretakers (name, street, zip_code) values('Morten', 'rødvej 1' , 2800); 
insert into caretakers (name, street, zip_code) values('Jörg', 'gulvej 1' , 8900); 
insert into caretakers (name, street, zip_code) values('Malene', 'blåvej 1' , 2800); 
insert into caretakers (name, street, zip_code) values('Mads', 'lillavej 1' , 8900); 
insert into caretakers (name, street, zip_code) values('Benjamin', 'jordbærvej 1' , 2800); 
insert into caretakers (name, street, zip_code) values('fransi', 'blåbærvej 1' , 8900); 
insert into caretakers (name, street, zip_code) values('Anders', 'hindbærvej 1' , 2800); 
insert into caretakers (name, street, zip_code) values('Martin', 'nøddevej 1' , 8900); 
insert into caretakers (name, street, zip_code) values('Dora', 'birkevej 1' , 2800); 


-- Caretakers' pets

insert into pets_caretakers (caretaker_id, pet_id) values(1, 5);
insert into pets_caretakers (caretaker_id, pet_id) values(1, 7);
insert into pets_caretakers (caretaker_id, pet_id) values(2, 5);
insert into pets_caretakers (caretaker_id, pet_id) values(2, 12);
insert into pets_caretakers (caretaker_id, pet_id) values(3, 18);
insert into pets_caretakers (caretaker_id, pet_id) values(3, 2);
insert into pets_caretakers (caretaker_id, pet_id) values(4, 9);
insert into pets_caretakers (caretaker_id, pet_id) values(4, 2);
insert into pets_caretakers (caretaker_id, pet_id) values(5, 3);
insert into pets_caretakers (caretaker_id, pet_id) values(6, 1);
insert into pets_caretakers (caretaker_id, pet_id) values(7, 9);
insert into pets_caretakers (caretaker_id, pet_id) values(8, 4);
insert into pets_caretakers (caretaker_id, pet_id) values(9, 6);
insert into pets_caretakers (caretaker_id, pet_id) values(10, 8);

select * from caretakers;