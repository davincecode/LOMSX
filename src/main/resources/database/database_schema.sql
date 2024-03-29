-- Drop tables if they exist
DROP TABLE IF EXISTS user_messages;
DROP TABLE IF EXISTS direct_messages;
DROP TABLE IF EXISTS messages;
DROP TABLE IF EXISTS users;
DROP TABLE IF EXISTS broadcast_messages;
DROP TABLE IF EXISTS friends;
DROP TABLE IF EXISTS friends_messages;

-- Table to store information about users
CREATE TABLE users
(
    user_id  INT PRIMARY KEY AUTO_INCREMENT,
    username VARCHAR(255) NOT NULL UNIQUE,
    password VARCHAR(255) NOT NULL
);

-- Table to store information about broadcast messages
CREATE TABLE broadcast_messages
(
    message_id   INT PRIMARY KEY AUTO_INCREMENT,
    sender_id    INT  NOT NULL,
    message_text TEXT NOT NULL,
    timestamp    TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (sender_id) REFERENCES users (user_id) ON DELETE CASCADE
);

-- Table to store information about friends
CREATE TABLE friends
(
    friendship_id INT PRIMARY KEY AUTO_INCREMENT,
    user_id       INT NOT NULL,
    friend_id     INT NOT NULL,
    timestamp     TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (user_id) REFERENCES users (user_id) ON DELETE CASCADE,
    FOREIGN KEY (friend_id) REFERENCES users (user_id) ON DELETE CASCADE
);

-- Table to store information about friends messages
CREATE TABLE friends_messages
(
    message_id   INT PRIMARY KEY AUTO_INCREMENT,
    sender_id    INT  NOT NULL,
    receiver_id  INT  NOT NULL,
    message_text TEXT NOT NULL,
    timestamp    TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (sender_id) REFERENCES users (user_id) ON DELETE CASCADE,
    FOREIGN KEY (receiver_id) REFERENCES users (user_id) ON DELETE CASCADE
);

-- Table to store information about direct messages
CREATE TABLE direct_messages
(
    message_id   INT PRIMARY KEY AUTO_INCREMENT,
    sender_id    INT  NOT NULL,
    receiver_id  INT  NOT NULL,
    message_text TEXT NOT NULL,
    timestamp    TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (sender_id) REFERENCES users (user_id) ON DELETE CASCADE,
    FOREIGN KEY (receiver_id) REFERENCES users (user_id) ON DELETE CASCADE
);
