CREATE DATABASE db_cocktails
    WITH
    OWNER = postgres
    TEMPLATE = template0
    ENCODING = 'UTF8'
    LC_COLLATE = 'Slovak_Slovakia.1250'
    LC_CTYPE = 'Slovak_Slovakia.1250'
    TABLESPACE = pg_default
    CONNECTION LIMIT = -1;
    
    
    
CREATE SCHEMA IF NOT EXISTS co
AUTHORIZATION postgres;
    



CREATE TABLE IF NOT EXISTS co.t_cocktails
(
    cocktail_id bigint NOT NULL DEFAULT nextval('co.t_cocktails_cocktail_id_seq'::regclass),
    name character(50) COLLATE pg_catalog."default" NOT NULL,
    url character(1000) COLLATE pg_catalog."default" NOT NULL,
    CONSTRAINT t_cocktails_pk PRIMARY KEY (cocktail_id)
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS co.t_cocktails
    OWNER to postgres;
    
    
    
    
    
CREATE TABLE IF NOT EXISTS co.t_cocktails_x_ingredients
(
    cocktail_id bigint NOT NULL DEFAULT nextval('co.t_cocktails_x_ingredients_cocktail_id_seq'::regclass),
    ingredient_id bigint NOT NULL DEFAULT nextval('co.t_cocktails_x_ingredients_ingredient_id_seq'::regclass),
    CONSTRAINT t_cocktails_x_ingredients_t_cocktails_null_fk FOREIGN KEY (cocktail_id)
        REFERENCES co.t_cocktails (cocktail_id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION,
    CONSTRAINT t_cocktails_x_ingredients_t_ingredients_null_fk FOREIGN KEY (ingredient_id)
        REFERENCES co.t_ingredients (ingredient_id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS co.t_cocktails_x_ingredients
    OWNER to postgres;
    
    
    
CREATE TABLE IF NOT EXISTS co.t_ingredients
(
    ingredient_id bigint NOT NULL DEFAULT nextval('co.t_ingredients_ingredient_id_seq'::regclass),
    name character(50) COLLATE pg_catalog."default" NOT NULL,
    CONSTRAINT t_ingredients_pk PRIMARY KEY (ingredient_id)
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS co.t_ingredients
    OWNER to postgres;