USE initDataBase;

INSERT INTO developers VALUES
                           (1, 'John Doe', 25, 'male',3200),
                           (2, 'Kryakva Batcovich', 21, 'female',500),
                           (3, 'Gus Batcovich', 33, 'male',9600),
                           (4, 'Ivan Ivanovich', 35, 'male',10050),
                           (5, 'Vasya Pupkin', 20, 'male',2060),
                           (6, 'John Smith', 22, 'male',3800),
                           (7, 'Maria Ivanovna', 33, 'female',1000),
                           (8, 'Bags Bunny', 19, 'male',5000),
                           (9, 'Daffy Duck', 25, 'male',7300),
                           (10, 'Gomer Simpson', 40, 'male',13000),
                           (11, 'Lola Bunny', 18, 'female',25000);

INSERT INTO skills VALUES
                       (1, 'Java','Junior'),
                       (2, 'Java','Middle'),
                       (3, 'Java','Senior'),
                       (4, 'Kotlin','Junior'),
                       (5, 'Kotlin','Middle'),
                       (6, 'Kotlin','Senior'),
                       (7, 'Python','Junior'),
                       (8, 'Python','Middle'),
                       (9, 'Python','Senior'),
                       (10, 'C++','Junior'),
                       (11, 'C++','Middle'),
                       (12, 'C++','Senior'),
                       (13, 'JavaScript','Junior'),
                       (14, 'JavaScript','Middle'),
                       (15, 'JavaScript','Senior');

INSERT INTO projects VALUES
                         (1, 'Assassins Creed', 'Gaming', 50000000, '2020-05-21'),
                         (2, 'Mobile Bank', 'Bank', 3700000, '2021-06-22'),
                         (3, 'Weather Prognoses', 'Radio', 2000000, '2020-10-10'),
                         (4, 'Robotics', 'Machine Learning',500000000 , '2018-03-21'),
                         (5, 'Grand Theft Auto V', 'Gaming', 265000000, '2013-09-17'),
                         (6, 'Design', 'Gaming', 10000000, '2019-05-18'),
                         (7, 'Android ', 'Mobile operating system',300000000, '2021-08-27');


INSERT INTO companies VALUES
                          (1, 'N-iX', 'Lviv'),
                          (2, 'Ubisoft Montreal', 'Montreal'),
                          (3, 'Rockstar Games', 'New-York'),
                          (4, 'Boston Dynamics', 'Waltham'),
                          (5, 'Google','Mountain View'),
                          (6,'Itransition','Kiyv');

INSERT INTO customers VALUES
                          (1, 'Universal Bank','Kyiv','Bank'),
                          (2, 'CRM','Chernigiv','News'),
                          (3, 'Samsung', 'Seoul','Conglomerate'),
                          (4,'Konami','Tokyo', 'Video Games'),
                          (5, 'Gaming players', 'All World','Gaming');

INSERT INTO developers_skills VALUES
                                  (1,3),(1,11),(2,13),(3,3),(3,5),(4,3),(4,8),(4,6),(5,13),(5,9),(6,5),
                                  (6,10),(7,15),(7,11),(8,2),(8,12),(9,1),(9,7),(10,9),(10,4),(11,12),(11,14);

INSERT INTO developers_projects VALUES
                                    (1,5),(2,7),(3,7),(4,4),(5,4),(5,3),(5,6),(6,1),(6,5),(7,1),(7,2),(7,6),(8,1),(8,2),(8,5),(9,4),(10,7),(11,5);

INSERT INTO companies_projects VALUES
                                   (1,2),(2,6),(3,1),(4,4),(5,3),(6,6),(5,7);

INSERT INTO customers_projects VALUES
                                   (1,2),(1,7),(2,3),(2,2),(3,7),(3,4),(3,6),(4,7),(4,6),(5,1),(5,5);

