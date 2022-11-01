--persons
INSERT INTO public.persons (id, age, name, sex, surname, phone, work_phone, local_code)
VALUES (1, 20, 'Paul', 'M', 'Attreides', '+79122370027', '849599999999', '+7');
INSERT INTO public.persons (id, age, name, sex, surname, phone, work_phone, local_code)
VALUES (2, 15, 'Peter', 'M', 'Parker', '+79122370027', '849599999999', '+7');

-- documents
INSERT INTO public.documents (id, number, type, person_id)
VALUES (1, 1, 'PASSPORT', 1);
INSERT INTO public.documents (id, number, type, person_id)
VALUES (2, 2, 'DRIVER_LICENCE', 1);
INSERT INTO public.documents (id, number, type, person_id)
VALUES (3, 1, 'DRIVER_LICENCE', 2);
