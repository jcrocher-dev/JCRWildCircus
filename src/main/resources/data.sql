
INSERT INTO `spectacle_entitie` (`auteur`, `categorie`, `date_creation`, `description`, `duree`, `img1`, `img2`, `img3`, `long_description`, `nom`) 
VALUES ('Jean Pierre Canet', 'Jeune public', '2019', 'En tous CAS ils sont trois, Un et deux, deux et un ! Trio improbable, un lance, l’autre rattrape, Tout se joue  avec humour...,', '1h', '/pictures/spectacle1.jpg', '/pictures/spectacle1-2.jpg', '/pictures/spectacle1-3.jpg', 'En tous CAS ils sont trois, Un et deux, deux et un ! Trio improbable, un lance, l’autre rattrape, Tout se joue  avec humour, Deux sont là, l’autre pas ! Ils s’élancent, de voltiges en rattrapes, D’équilibres en déséquilibres, de conflits en harmonie. Chloé. André. Séverine. Pour connaître la suite il va falloir venir !! Cirque A Suivre……', 'CAS');
INSERT INTO `spectacle_entitie` (`auteur`, `categorie`, `date_creation`, `description`, `duree`, `img1`, `img2`, `img3`, `long_description`, `nom`) 
VALUES ('Jacques Michaud', 'Tout public', '2017', 'La compagnie JCR Wild Circus vous présente Sylvin, un personnage burlesque (voir Auguste) qui prend un malin plaisirs à prendre le public à partie.', '45min à 1h', '/pictures/spectacle2.jpg', '/pictures/spectacle2-2.jpg', '/pictures/spectacle2-3.jpg', 'La compagnie Cri-O-Lane Circus vous présente Sylvin, un personnage burlesque (voir Auguste) qui prend un malin plaisirs à prendre le public à partie. Il propose des numéros de Magie!(il n’est pas magicien), de Jonglerie!(il n’est pas jongleur), d’acrobatie!(il n’est pas acrobate). Il est quoi au juste? eh bien! surtout gaffeur. Participant à des festivals de magie et des plateaux d’artistes, il lui arrive même de proposer des spectacles de 45mn à 1h!', 'SYLVIN');
INSERT INTO `spectacle_entitie` (`auteur`, `categorie`, `date_creation`, `description`, `duree`, `img1`, `img2`, `img3`, `long_description`, `nom`) 
VALUES ('Jean Pierre Canet', 'Tout public', '2016', 'La compagnie JCR Wild Circus présente sa dernière création 2016-2017. Avec l’oeil extérieur de Jeremy Olivier de la Cie Toi d’Abord.', '45min à 1h', '/pictures/spectacle3.jpg', '/pictures/spectacle3-2.jpg', '/pictures/spectacle3-3.jpg', 'La compagnie JCR Wild Circus présente sa dernière création 2016-2017. Avec l’oeil extérieur de Jeremy Olivier de la Cie Toi d’Abord. Le spectacle Eh! Alors!!, nous emmène dans une ambiance, entre le Clown et le burlesque, les deux garçons sont professionnels, alors que la fille et plus en fin de carrière qu’au début…………..bref, l’idée, il faut lui accrocher le cerceau aérien, pour que le spectacle commence.', 'Eh! Alors!');


INSERT INTO `schedule` (`adresse`, `cp`, `date`, `heure`, `lieu`, `ville`, `spectacle_entitie_id`) 
VALUES ('', '45000', '22 fevrier 2020', '16h', 'Parc Pasteur', 'Orleans', '1');
INSERT INTO `schedule` (`adresse`, `cp`, `date`, `heure`, `lieu`, `ville`, `spectacle_entitie_id`) 
VALUES ('255 rue de la chevre qui danse', '37000', '14 mars 2020', '20h30', 'Salle Gustave Eiffel', 'Joué les Tours', '1');
INSERT INTO `schedule` (`adresse`, `cp`, `date`, `heure`, `lieu`, `ville`, `spectacle_entitie_id`) 
VALUES ('', '15000', '21 juin 2020', '18h', 'place de la mairie', 'Aurillac', '2');


INSERT INTO `contact_entitie` (`email`, `is_present`, `message`, `nom`, `sujet`) 
VALUES ('chris@orleansjoue.fr', b'1', 'Je souhaitais connaitre le prix du spectacle CAS pour le programmer dans ma commune dans l\'Aveyron', 'Christophe Frère', 'spectacle CAS');
INSERT INTO `contact_entitie` (`email`, `is_present`, `message`, `nom`, `sujet`) 
VALUES ('Jeanpierre@gmail.com', b'1', 'Bonjour, j\'ai eu l\'occasion de vous voir lors de votre passage à Chinon la semaine dernière et je souhaitais vous félicitez pour la qualité de votre spectacle', 'Jean Pierre', 'Sylvin');

