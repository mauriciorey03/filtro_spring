CREATE TABLE `property`(
    `id` INT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `size` DOUBLE(8, 2) NOT NULL,
    `address` INT NOT NULL,
    `price` DOUBLE(8, 2) NOT NULL,
    `availability` BIGINT NOT NULL,
    `keys_state` TINYINT(1) NOT NULL DEFAULT '1',
    `type` ENUM('ville', 'house', 'local', 'flat') NOT NULL,
    `id_owner` INT NOT NULL,
    `id_characteristics` INT NOT NULL,
    `id_zone` INT NOT NULL,
    `id_visita` INT NOT NULL,
    `id_office` INT NOT NULL
);

-- Insert 1 (house)
INSERT INTO property (size, address, price, availability, keys_state, type, id_characteristics, id_zone, id_visita, id_office)
VALUES (72.50, 37890, 225000.00, STR_TO_DATE('2024-05-15', '%Y-%m-%d'), 1, 'house', 3, 2, 0, 1);

-- Insert 2 (flat available)
INSERT INTO property (size, address, price, availability, keys_state, type, id_characteristics, id_zone, id_visita, id_office)
VALUES (48.21, 56982, 140000.00, 'Available', 1, 'flat', 2, 4, 1, 2);

-- Insert 3 (local)
INSERT INTO property (size, address, price, availability, keys_state, type, id_characteristics, id_zone, id_visita, id_office)
VALUES (95.78, 12453, 310000.00, STR_TO_DATE('2024-04-27', '%Y-%m-%d'), 1, 'local', 4, 1, 0, 1);

-- Insert 4 (ville with visit)
INSERT INTO property (size, address, price, availability, keys_state, type, id_characteristics, id_zone, id_visita, id_office)
VALUES (110.25, 78541, 450000.00, STR_TO_DATE('2024-04-20', '%Y-%m-%d'), 1, 'ville', 1, 3, 2, 2);

-- Insert 5 (flat recently added)
INSERT INTO property (size, address, price, availability, keys_state, type, id_characteristics, id_zone, id_visita, id_office)
VALUES (32.90, 25871, 98000.00, 'Available', 1, 'flat', 5, 4, 0, 1);


CREATE TABLE `visitedStatexClient`(
    `id` INT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `id_cliente` INT NOT NULL,
    `id_state` INT NOT NULL,
    `date_visited` DATETIME NOT NULL,
    `comment` VARCHAR(255) NOT NULL,
    `interested` TINYINT(1) NOT NULL DEFAULT '1'
);

-- Insert 1 (house)
INSERT INTO property (size, address, price, availability, keys_state, type, id_characteristics, id_zone, id_visita, id_office)
VALUES (72.50, 37890, 225000.00, STR_TO_DATE('2024-05-15', '%Y-%m-%d'), 1, 'house', 3, 2, 0, 1);

-- Insert 2 (flat available)
INSERT INTO property (size, address, price, availability, keys_state, type, id_characteristics, id_zone, id_visita, id_office)
VALUES (48.21, 56982, 140000.00, 'Available', 1, 'flat', 2, 4, 1, 2);

-- Insert 3 (local)
INSERT INTO property (size, address, price, availability, keys_state, type, id_characteristics, id_zone, id_visita, id_office)
VALUES (95.78, 12453, 310000.00, STR_TO_DATE('2024-04-27', '%Y-%m-%d'), 1, 'local', 4, 1, 0, 1);

-- Insert 4 (ville with visit)
INSERT INTO property (size, address, price, availability, keys_state, type, id_characteristics, id_zone, id_visita, id_office)
VALUES (110.25, 78541, 450000.00, STR_TO_DATE('2024-04-20', '%Y-%m-%d'), 1, 'ville', 1, 3, 2, 2);

-- Insert 5 (flat recently added)
INSERT INTO property (size, address, price, availability, keys_state, type, id_characteristics, id_zone, id_visita, id_office)
VALUES (32.90, 25871, 98000.00, 'Available', 1, 'flat', 5, 4, 0, 1);


CREATE TABLE `zone`(
    `id` INT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `zone` ENUM('NORTH', 'SOUTH', 'EAST', 'WEST') NOT NULL
);

INSERT INTO zone (zone) VALUES ('NORTH');
INSERT INTO zone (zone) VALUES ('SOUTH');
INSERT INTO zone (zone) VALUES ('EAST');
INSERT INTO zone (zone) VALUES ('WEST');
INSERT INTO zone (zone) VALUES ('CENTRAL');  -- Add a central zone (optional)


CREATE TABLE `office`(
    `id` INT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `name` VARCHAR(255) NOT NULL,
    `address` VARCHAR(255) NOT NULL,
    `id_city` BIGINT NOT NULL
);

-- Insert 1 (Main Office)
INSERT INTO office (name, address, id_city)
VALUES ('Main Office', '123 Main St', 1234567890);

-- Insert 2 (Branch Office)
INSERT INTO office (name, address, id_city)
VALUES ('Branch Office', '456 Elm St', 9876543210);

-- Insert 3 (West Zone Office)
INSERT INTO office (name, address, id_city)
VALUES ('West Zone Office', '789 Elm St', 9876543211);  -- Example with different city ID

-- Insert 4 (Central Office) (optional)
INSERT INTO office (name, address, id_city)
VALUES ('Central Office', '567 Park Ave', 1234567892);  -- Example with different city ID

-- Insert 5 (South Office)
INSERT INTO office (name, address, id_city)
VALUES ('South Office', '321 Oak St', 8765432109);


CREATE TABLE `client`(
    `id_client` INT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `name` VARCHAR(255) NOT NULL,
    `lastName` VARCHAR(255) NOT NULL,
    `telContact` VARCHAR(255) NOT NULL,
    `email` VARCHAR(255) NOT NULL
);

-- Insert 1
INSERT INTO client (name, lastName, telContact, email)
VALUES ('John', 'Doe', '+1234567890', 'johndoe@email.com');

-- Insert 2
INSERT INTO client (name, lastName, telContact, email)
VALUES ('Jane', 'Smith', '+9876543210', 'janesmith@email.com');

-- Insert 3
INSERT INTO client (name, lastName, telContact, email)
VALUES ('Michael', 'Johnson', '+0123456789', 'michael.johnson@email.com');

-- Insert 4
INSERT INTO client (name, lastName, telContact, email)
VALUES ('Emily', 'Garcia', '+5412345678', 'emilygarcia@email.com');

-- Insert 5
INSERT INTO client (name, lastName, telContact, email)
VALUES ('David', 'Williams', '+3365432109', 'david.williams@email.com');

CREATE TABLE `city`(
    `id` INT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `name` VARCHAR(255) NOT NULL
);

INSERT INTO city (name) VALUES ('New York City');
INSERT INTO city (name) VALUES ('Los Angeles');
INSERT INTO city (name) VALUES ('Chicago');
INSERT INTO city (name) VALUES ('Houston');
INSERT INTO city (name) VALUES ('Phoenix');

CREATE TABLE `owner`(
    `id` INT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `name` VARCHAR(255) NOT NULL,
    `lastName` VARCHAR(255) NOT NULL,
    `telContact` INT NOT NULL,
    `email` VARCHAR(255) NOT NULL
);

-- Insert 1
INSERT INTO owner (name, lastName, telContact, email)
VALUES ('Alice', 'Brown', 1234567890, 'alice.brown@email.com');

-- Insert 2
INSERT INTO owner (name, lastName, telContact, email)
VALUES ('Bob', 'Miller', 9876543210, 'bob.miller@email.com');

-- Insert 3
INSERT INTO owner (name, lastName, telContact, email)
VALUES ('Charlie', 'Garcia', 0123456789, 'charlie.garcia@email.com');

-- Insert 4
INSERT INTO owner (name, lastName, telContact, email)
VALUES ('Diana', 'Wilson', 5412345678, 'diana.wilson@email.com');

-- Insert 5
INSERT INTO owner (name, lastName, telContact, email)
VALUES ('Edward', 'Thomas', 3365432109, 'edward.thomas@email.com');

CREATE TABLE `users`(
    `id` INT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `user` VARCHAR(255) NOT NULL,
    `password` VARCHAR(255) NOT NULL,
    `condition` ENUM('USER', 'ADMIN') NOT NULL
);

-- Insert 1 (User)
INSERT INTO users (user, password, condition)
VALUES ('user1', 'placeholder_password', 'USER');

-- Insert 2 (Admin)
INSERT INTO users (user, password, condition)
VALUES ('admin', 'placeholder_password', 'ADMIN');

-- Insert 3 (Another user)
INSERT INTO users (user, password, condition)
VALUES ('user2', 'placeholder_password', 'USER');

-- Insert 4 (Another user)
INSERT INTO users (user, password, condition)
VALUES ('user3', 'placeholder_password', 'USER');

-- Insert 5 (Another user)
INSERT INTO users (user, password, condition)
VALUES ('user4', 'placeholder_password', 'USER');


CREATE TABLE `characteristics`(
    `id` INT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `rooms` INT NOT NULL,
    `bathrooms` INT NOT NULL,
    `kitchen` TINYINT(1) NOT NULL DEFAULT '1',
    `cleaning_room` TINYINT(1) NOT NULL DEFAULT '1',
    `total_entry` INT NOT NULL,
    `conditioned` TINYINT(1) NOT NULL DEFAULT '0',
    `size_ville` INT NOT NULL,
    `urbanization` INT NOT NULL,
    `used` TINYINT(1) NOT NULL DEFAULT '1',
    `other` VARCHAR(255) NOT NULL
);

-- Insert 1 (House)
INSERT INTO characteristics (rooms, bathrooms, kitchen, cleaning_room, total_entry, conditioned, size_ville, urbanization, used, other)
VALUES (3, 2, 1, 1, 1, 1, 0, 0, 1, 'Fireplace in living room');

-- Insert 2 (Flat)
INSERT INTO characteristics (rooms, bathrooms, kitchen, cleaning_room, total_entry, conditioned, size_ville, urbanization, used, other)
VALUES (2, 1, 1, 0, 1, 1, 0, 1, 1, 'Balcony with city view');

-- Insert 3 (Local)
INSERT INTO characteristics (rooms, bathrooms, kitchen, cleaning_room, total_entry, conditioned, size_ville, urbanization, used, other)
VALUES (1, 0, 1, 0, 1, 0, 0, 0, 1, 'Large storefront window');

-- Insert 4 (Ville with conditioned air)
INSERT INTO characteristics (rooms, bathrooms, kitchen, cleaning_room, total_entry, conditioned, size_ville, urbanization, used, other)
VALUES (4, 3, 1, 1, 2, 1, 250, 1, 1, 'Pool and garden area');

-- Insert 5 (Used flat with additional features)
INSERT INTO characteristics (rooms, bathrooms, kitchen, cleaning_room, total_entry, conditioned, size_ville, urbanization, used, other)
VALUES (1, 1, 1, 0, 1, 1, 0, 0, 0, 'Built-in closets, security door');

ALTER TABLE
    `office` ADD CONSTRAINT `office_id_city_foreign` FOREIGN KEY(`id_city`) REFERENCES `city`(`id`);
ALTER TABLE
    `visitedStatexClient` ADD CONSTRAINT `visitedstatexclient_id_cliente_foreign` FOREIGN KEY(`id_cliente`) REFERENCES `client`(`id_client`);
ALTER TABLE
    `property` ADD CONSTRAINT `property_id_office_foreign` FOREIGN KEY(`id_office`) REFERENCES `office`(`id`);
ALTER TABLE
    `office` ADD CONSTRAINT `office_id_foreign` FOREIGN KEY(`id`) REFERENCES `users`(`id`);
ALTER TABLE
    `property` ADD CONSTRAINT `property_id_characteristics_foreign` FOREIGN KEY(`id_characteristics`) REFERENCES `characteristics`(`id`);
ALTER TABLE
    `property` ADD CONSTRAINT `property_id_owner_foreign` FOREIGN KEY(`id_owner`) REFERENCES `owner`(`id`);
ALTER TABLE
    `visitedStatexClient` ADD CONSTRAINT `visitedstatexclient_id_state_foreign` FOREIGN KEY(`id_state`) REFERENCES `property`(`id_visita`);
ALTER TABLE
    `property` ADD CONSTRAINT `property_id_zone_foreign` FOREIGN KEY(`id_zone`) REFERENCES `zone`(`id`);