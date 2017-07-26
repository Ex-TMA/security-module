CREATE TABLE AccountToken (
  createdAt timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  id int(11) NOT NULL AUTO_INCREMENT,
  accountId int(11) NOT NULL,
  token varchar(64) NOT NULL,
  ip varchar(100) DEFAULT NULL,
  expiresAt timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (id),
  UNIQUE KEY token (token),
  KEY createdAt (createdAt)
) ENGINE=InnoDB;