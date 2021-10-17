DROP DATABASE IF EXISTS initDataBase;
CREATE DATABASE IF NOT EXISTS initDataBase;
use initDataBase;

CREATE TABLE developers (
                            id INT NOT NULL AUTO_INCREMENT,
                            name VARCHAR(55) NOT NULL,
                            age INT(3),
                            gender VARCHAR(10),
                            salary LONG not null,
                            PRIMARY KEY (id));

CREATE TABLE skills (
                        id INT NOT NULL AUTO_INCREMENT,
                        language VARCHAR(10),
                        level VARCHAR(10),
                        PRIMARY KEY (id));

CREATE TABLE projects (
                          id INT NOT NULL AUTO_INCREMENT,
                          name VARCHAR(100) NOT NULL,
                          field VARCHAR(50) NOT NULL,
                          cost  LONG NOT NULL,
                          create_date date not null,
                          PRIMARY KEY (id));

CREATE TABLE companies (
                           id INT NOT NULL AUTO_INCREMENT,
                           name VARCHAR(20) NOT NULL,
                           city VARCHAR(20) NOT NULL,
                           PRIMARY KEY (id));

CREATE TABLE customers (
                           id INT NOT NULL AUTO_INCREMENT,
                           name VARCHAR(25) NOT NULL,
                           city VARCHAR(20) NOT NULL,
                           industry VARCHAR (20) NOT NULL,
                           PRIMARY KEY (id));
CREATE TABLE developers_skills (
                                   id_developer INT NOT NULL,
                                   id_skill INT NOT NULL,
                                   PRIMARY KEY (id_developer, id_skill),
                                   FOREIGN KEY (id_developer) REFERENCES developers (id),
                                   FOREIGN KEY (id_skill) REFERENCES skills (id));

CREATE TABLE developers_projects (
                                     id_developer INT NOT NULL,
                                     id_project INT NOT NULL,
                                     PRIMARY KEY (id_developer, id_project),
                                     FOREIGN KEY (id_developer) REFERENCES developers (id),
                                     FOREIGN KEY (id_project) REFERENCES projects (id));

CREATE TABLE companies_projects (
                                    id_company INT NOT NULL,
                                    id_project INT NOT NULL,
                                    PRIMARY KEY (id_company, id_project),
                                    KEY id_project (id_project),
                                    FOREIGN KEY (id_company) REFERENCES companies (id),
                                    FOREIGN KEY (id_project) REFERENCES projects (id));

CREATE TABLE customers_projects (
                                    id_customer INT NOT NULL,
                                    id_project INT NOT NULL,
                                    PRIMARY KEY (id_customer, id_project),
                                    KEY id_project (id_project),
                                    FOREIGN KEY (id_customer) REFERENCES customers (id),
                                    FOREIGN KEY (id_project) REFERENCES projects (id));
