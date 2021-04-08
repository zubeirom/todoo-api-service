DROP TABLE IF EXISTS todos;
CREATE TABLE todos(id serial PRIMARY KEY, description VARCHAR(500), priority integer);