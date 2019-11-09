CREATE TABLE public.bakery
(
    id SERIAL PRIMARY KEY NOT NULL,
    bakery_type VARCHAR(300),
    price DECIMAL,
    date_start TIMESTAMP,
    date_end TIMESTAMP
);