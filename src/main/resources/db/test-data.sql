--persons
INSERT INTO public.persons (id, age, name, sex, surname) VALUES (1, 20, 'Paul', 'M', 'Attreides');
INSERT INTO public.persons (id, age, name, sex, surname) VALUES (2, 15, 'Peter', 'M', 'Parker');

-- documents
INSERT INTO public.documents (id, number, type, person_id) VALUES (1, 1, 'PASSPORT', 1);
INSERT INTO public.documents (id, number, type, person_id) VALUES (2, 2, 'DRIVER_LICENCE', 1);
INSERT INTO public.documents (id, number, type, person_id) VALUES (3, 1, 'DRIVER_LICENCE', 2);
