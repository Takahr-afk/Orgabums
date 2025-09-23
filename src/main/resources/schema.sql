CREATE TABLE klient (
                        id BIGINT AUTO_INCREMENT PRIMARY KEY,
                        vorname VARCHAR(100) NOT NULL,
                        nachname VARCHAR(100) NOT NULL,
                        geburtsdatum DATE,
                        erstellt_am TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);
