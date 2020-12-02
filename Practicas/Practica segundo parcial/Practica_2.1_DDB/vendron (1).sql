-- phpMyAdmin SQL Dump
-- version 4.8.4
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1:3306
-- Tiempo de generación: 12-03-2019 a las 05:37:55
-- Versión del servidor: 5.7.24
-- Versión de PHP: 7.2.14

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `vendron`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `boletosclientes`
--

DROP TABLE IF EXISTS `boletosclientes`;
CREATE TABLE IF NOT EXISTS `boletosclientes` (
  `idBoletoCliente` int(11) NOT NULL AUTO_INCREMENT,
  `idPelicula` int(11) NOT NULL,
  `idUsuario` int(11) NOT NULL,
  `horario` varchar(45) NOT NULL,
  `fecha` varchar(45) NOT NULL,
  PRIMARY KEY (`idBoletoCliente`),
  UNIQUE KEY `idBoletoCliente_UNIQUE` (`idBoletoCliente`)
) ENGINE=InnoDB AUTO_INCREMENT=84 DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `boletosclientes`
--

INSERT INTO `boletosclientes` (`idBoletoCliente`, `idPelicula`, `idUsuario`, `horario`, `fecha`) VALUES
(8, 15, 0, '10:00 a.m', '09-06-2017'),
(9, 15, 0, '10:00 a.m', '09-06-2017'),
(10, 15, 0, '10:00 a.m', '09-06-2017'),
(11, 15, 0, '10:00 a.m', '09-06-2017'),
(12, 15, 0, '10:00 a.m', '09-06-2017'),
(13, 15, 0, '10:00 a.m', '09-06-2017'),
(14, 15, 0, '10:00 a.m', '09-06-2017'),
(15, 15, 0, '10:00 a.m', '09-06-2017'),
(16, 15, 0, '10:00 a.m', '09-06-2017'),
(17, 15, 0, '10:00 a.m', '09-06-2017'),
(18, 15, 0, '10:00 a.m', '09-06-2017'),
(19, 15, 0, '10:00 a.m', '09-06-2017'),
(20, 15, 0, '10:00 a.m', '09-06-2017'),
(21, 15, 0, '10:00 a.m', '09-06-2017'),
(22, 15, 0, '10:00 a.m', '09-06-2017'),
(23, 15, 0, '10:00 a.m', '09-06-2017'),
(24, 15, 0, '10:00 a.m', '09-06-2017'),
(25, 15, 0, '03:00 p.m', '11-06-2017'),
(26, 17, 2, '10:00 a.m', '09-06-2017'),
(27, 17, 2, '10:00 a.m', '09-06-2017'),
(28, 17, 2, '10:00 a.m', '09-06-2017'),
(29, 17, 2, '10:00 a.m', '09-06-2017'),
(30, 17, 2, '10:00 a.m', '09-06-2017'),
(31, 17, 2, '10:00 a.m', '09-06-2017'),
(32, 17, 2, '10:00 a.m', '09-06-2017'),
(33, 17, 2, '10:00 a.m', '09-06-2017'),
(34, 20, 0, '10:00 a.m', '09-06-2017'),
(35, 3, 0, '10:00 a.m', '09-06-2017'),
(36, 3, 0, '10:00 a.m', '09-06-2017'),
(37, 3, 0, '10:00 a.m', '09-06-2017'),
(38, 3, 0, '10:00 a.m', '09-06-2017'),
(39, 4, 0, '04:30 p.m', '14-06-2017'),
(40, 4, 0, '04:30 p.m', '14-06-2017'),
(41, 4, 0, '04:30 p.m', '14-06-2017'),
(42, 4, 0, '04:30 p.m', '14-06-2017'),
(43, 1, 22, '03:00 p.m', '12-06-2017'),
(44, 1, 22, '03:00 p.m', '12-06-2017'),
(45, 1, 22, '03:00 p.m', '12-06-2017'),
(46, 1, 22, '03:00 p.m', '12-06-2017'),
(47, 1, 22, '03:00 p.m', '12-06-2017'),
(48, 1, 22, '03:00 p.m', '12-06-2017'),
(49, 1, 22, '03:00 p.m', '12-06-2017'),
(50, 1, 22, '03:00 p.m', '12-06-2017'),
(51, 1, 22, '03:00 p.m', '12-06-2017'),
(52, 1, 22, '03:00 p.m', '12-06-2017'),
(53, 2, 22, '10:00 a.m', '09-06-2017'),
(54, 2, 22, '10:00 a.m', '09-06-2017'),
(55, 4, 2, '04:30 p.m', '10-06-2017'),
(56, 4, 2, '04:30 p.m', '10-06-2017'),
(57, 37, 2, '10:00 a.m', '09-06-2017'),
(58, 37, 2, '10:00 a.m', '09-06-2017'),
(59, 37, 2, '10:00 a.m', '09-06-2017'),
(60, 37, 2, '10:00 a.m', '09-06-2017'),
(61, 37, 2, '10:00 a.m', '09-06-2017'),
(62, 37, 2, '10:00 a.m', '09-06-2017'),
(63, 37, 2, '10:00 a.m', '09-06-2017'),
(64, 4, 2, '10:00 a.m', '09-06-2017'),
(65, 17, 25, '03:00 p.m', '11-06-2017'),
(66, 17, 25, '03:00 p.m', '11-06-2017'),
(67, 17, 25, '03:00 p.m', '11-06-2017'),
(68, 17, 25, '03:00 p.m', '11-06-2017'),
(69, 17, 25, '03:00 p.m', '11-06-2017'),
(70, 17, 25, '03:00 p.m', '11-06-2017'),
(71, 17, 25, '03:00 p.m', '11-06-2017'),
(72, 17, 25, '03:00 p.m', '11-06-2017'),
(73, 17, 25, '03:00 p.m', '11-06-2017'),
(74, 2, 26, '06:30 p.m', '12-06-2017'),
(75, 2, 26, '06:30 p.m', '12-06-2017'),
(76, 11, 27, '10:00 a.m', '13-06-2017'),
(77, 11, 27, '10:00 a.m', '13-06-2017'),
(78, 12, 29, '07:30 p.m', '15-06-2017'),
(79, 12, 29, '07:30 p.m', '15-06-2017'),
(80, 12, 29, '07:30 p.m', '15-06-2017'),
(81, 12, 29, '07:30 p.m', '15-06-2017'),
(82, 12, 29, '07:30 p.m', '13-03-2019'),
(83, 12, 29, '07:30 p.m', '13-03-2019');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `estatuspeliculas`
--

DROP TABLE IF EXISTS `estatuspeliculas`;
CREATE TABLE IF NOT EXISTS `estatuspeliculas` (
  `idEstatusPelicula` int(11) NOT NULL AUTO_INCREMENT,
  `estatus` varchar(45) NOT NULL,
  PRIMARY KEY (`idEstatusPelicula`),
  UNIQUE KEY `idEstatusDron_UNIQUE` (`idEstatusPelicula`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `estatuspeliculas`
--

INSERT INTO `estatuspeliculas` (`idEstatusPelicula`, `estatus`) VALUES
(1, 'Disponible'),
(2, 'No disponible');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `peliculas`
--

DROP TABLE IF EXISTS `peliculas`;
CREATE TABLE IF NOT EXISTS `peliculas` (
  `idPelicula` int(11) NOT NULL AUTO_INCREMENT,
  `idUsuarioRegistro` int(11) NOT NULL,
  `titulo` varchar(45) NOT NULL,
  `director` varchar(50) NOT NULL,
  `estreno` int(11) NOT NULL,
  `duracion` int(11) NOT NULL,
  `idioma` varchar(45) DEFAULT NULL,
  `pais` varchar(45) DEFAULT NULL,
  `clasificacion` varchar(45) DEFAULT NULL,
  `anio` varchar(45) DEFAULT NULL,
  `genero` varchar(45) DEFAULT NULL,
  `trailer` varchar(200) DEFAULT NULL,
  `nombreImagen` varchar(200) DEFAULT NULL,
  `sinopsis` varchar(1000) DEFAULT NULL,
  `idStatus` int(11) NOT NULL,
  `precioBoleto` decimal(10,2) DEFAULT NULL,
  PRIMARY KEY (`idPelicula`),
  UNIQUE KEY `idDron_UNIQUE` (`idPelicula`)
) ENGINE=InnoDB AUTO_INCREMENT=62 DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `peliculas`
--

INSERT INTO `peliculas` (`idPelicula`, `idUsuarioRegistro`, `titulo`, `director`, `estreno`, `duracion`, `idioma`, `pais`, `clasificacion`, `anio`, `genero`, `trailer`, `nombreImagen`, `sinopsis`, `idStatus`, `precioBoleto`) VALUES
(1, 1, 'Capitana Marvel', ' Anna Boden,  Ryan Fleck', 1, 124, 'Inglés/Español', 'Estados Unidos ', 'B', '2019', 'Ciencia Ficción', 'https://www.youtube.com/watch?time_continue=12&v=6XkN-MFNZpI', 'capitanamarvel.jpg', 'La historia sigue a Carol Danvers mientras ella se convierte en uno de los héroes más poderosos del universo cuando la Tierra se encuentre atrapada en medio de una guerra galáctica entre dos razas alienígenas. Situada en los años 90, Captain Marvel es una historia nueva de un período de tiempo nunca antes visto en la historia del Universo Cinematográfico de Marvel.', 1, '48.00'),
(2, 1, 'Feliz Día de tu Muerte 2', 'Christopher Landon', 1, 103, 'Español', 'Estados Unidos', 'B15 ', '2019', 'Terror', 'https://www.youtube.com/watch?time_continue=1&v=_DxsjDpriX0', 'fdm2.jpg', 'Dos años después de los eventos acaecidos en la primera película, Tree Gelbman vuelve a entrar en el bucle temporal para descubrir el motivo por el cual accedió a él en primer lugar. También debe hacer frente a Lori, que tras resucitar a causa del buble ha vuelto sedienta de venganza.', 1, '48.00'),
(3, 1, 'Cómo Entrenar A Tu Dragón 3', 'Dean DeBlois', 1, 110, 'Español', 'Estados Unidos ', 'A', '2019', 'Animacion', 'https://www.youtube.com/watch?v=k9jyizJmsl0', 'ced3.jpg', 'Lo que comenzó como la inesperada amistad entre un joven vikingo y un temible dragón Furia Nocturna se ha convertido en una épica trilogía que ha recorrido sus vidas. En esta nueva entrega, Hipo y Desdentao descubrirán finalmente su verdadero destino: para uno, gobernar Isla Mema junto a Astrid; para el otro, ser el líder de su especie. Pero, por el camino, deberán poner a prueba los lazos que los unen, plantando cara a la mayor amenaza que jamás hayan afrontado... y a la aparición de una Furia Nocturna hembra.', 2, '48.00'),
(4, 1, 'Venganza', 'Hans Petter Moland', 1, 118, 'Inglés/Español', 'Reino Unido', 'B15 ', '2019', 'Acción', 'https://www.youtube.com/watch?v=JMMN-QUPmOU', 'venganza.jpg', 'Un conductor de una barredora de nieve lleva una vida tranquila hasta que la muerte repentina de su hijo hace que se vea envuelto en una guerra entre narcotraficantes, armado solo con maquinaria pesada y la suerte del principiante.', 1, '48.00'),
(5, 1, 'Lady Rancho', 'Rafael Montero', 1, 92, 'Español', 'México', 'A', '2019', 'Comedia', 'https://www.youtube.com/watch?v=UInxRJuPxis', 'ladyrancho.jpg', 'Después de adquirir fama gracias a un video viral, Camila Pérez-Meyer, mejor conocida como #LadyJocho, es enviada al rancho familiar a trabajar todo el verano. Al llegar al ambiente rural Camila se da cuenta que en realidad no sabe hacer nada, no hay señal de celular, y que para comer hay que trabajar.', 2, '48.00'),
(6, 1, 'Battle Angel: La Última Guerrera', ' Robert Rodriguez', 1, 121, 'Español', 'Estados Unidos ', 'B', '2019', 'Ciencia Ficción', 'https://www.youtube.com/watch?v=HZpDuRzr_Xk', 'ultimaguerra.jpg', 'Cuando Alita se despierta sin recordar quién es en un mundo futuro que no reconoce, un médico compasivo, se da cuenta de que en algún lugar de ese caparazón de cyborg abandonado, está el corazón y alma de una mujer joven con un pasado extraordinario. Mientras Alita toma las riendas de su nueva vida y aprende a adaptarse a las peligrosas calles de Iron City, Ido tratará de protegerla de su propio pasado, mientras que su nuevo amigo Hugo se ofrecerá, en cambio, a ayudarla a desenterrar sus recuerdos. Cuando las fuerzas mortales y corruptas que manejan la ciudad comienzan a perseguir a Alita, ella descubre una pista crucial sobre su pasado: posee habilidades de combate únicas que los que ostentan el poder querrán controlar a toda costa', 1, '48.00'),
(7, 1, 'Obsesión: Serenity', 'Steven Knight', 1, 106, 'Estados Unidos', 'Estados Unidos', 'B15', '2019', 'Thriller', 'https://www.youtube.com/watch?time_continue=1&v=yoi9-8IaVco', 'serenity.jpg', 'El misterioso pasado de un capitán de un barco pesquero que vive en una pequeña isla del Caribe vuelve para atormentarle, atrapándolo en una nueva realidad que podría no ser lo que parece.', 1, '48.00'),
(8, 1, 'La Gran Aventura LEGO 2', 'Mike Mitchell', 1, 110, 'Español', 'Estados Unidos', 'A', '2019', 'Animación', 'https://www.youtube.com/watch?v=iXNaxP6ngo0', 'gal2.jpg', 'Después de cinco años de tranquilidad aparece una nueva amenaza: invasores de LEGO DUPLO del espacio exterior que lo destrozan todo antes de que dé tiempo a reconstruirlo. Emmet, Lucy, Batman y sus amigos unirán fuerzas para librar una batalla que les llevará a mundos inexplorados.', 1, '48.00'),
(9, 1, 'El Atentado del Siglo: Utoya', 'Erik Poppe', 1, 95, 'Inglés/Español', 'Noruega', 'B', '2019', 'Thriller', 'https://www.youtube.com/watch?time_continue=85&v=Kucbq-42tbQ', 'atentado.jpg', 'El 22 de julio de 2011, más de 500 jóvenes en un campamento de verano en una isla cercana a Oslo, (Noruega) fueron atacados por un extremista fuertemente armado. Ese mismo día, más temprano, colocó una bomba en un edificio del Gobierno en Oslo antes de dirigirse a la isla de Utøya. Los padres están conmocionados por el atentado en Oslo, pero los jóvenes les aseguran que no hay peligro porque ellos están lejos del incidente. De repente, todo cambia al escucharse disparos y Kaja, una de las adolescentes de la isla, tratará de sobrevivir minuto por minuto.', 1, '48.00'),
(10, 1, 'La Boda De Mi Mejor Amigo', 'Celso García', 1, 109, 'Español', 'México', 'B', '2019', 'Comedia', 'https://www.youtube.com/watch?v=ndEdK8hYj7I', 'bma.jpg', 'Julia es una renombrada crítica gastronómica con miedo al compromiso. A pesar de eso, su mejor amigo Manuel y ella se habían prometido que si para cuando cumplieran 35 años seguían solteros, se casarían entre ellos. Una tarde, Julia recibe una llamada de Manuel en la que le dice que dentro de cuatro días va a casarse con alguien más. Confiada en que ella es la única mujer para Manuel, Julia intentará detener la boda a toda costa.', 1, '48.00'),
(11, 1, 'Mirreyes vs. Godínez', 'Chava Cartas', 1, 109, 'Español Latino', 'México', 'B', '2019', 'Comedia', 'https://www.youtube.com/watch?v=MNdMlnhyZAw', 'mirreyes.jpg', 'Cuenta la historia de Genaro Rodríguez, un joven godi´n que ha dedicado su vida a trabajar en Kuri & Sons y a aprender de su jefe Don Francisco Kuri, que lo quiere como a un hijo ya que sabe que su propio hijo Santiago, un mirrey, quizá demasiado consentido pero con un gran corazón, no tiene el más mínimo interés por la empresa. El trabajo impecable de Genaro hace que Don Francisco confíe en él y le otorgue un poder importante sobre la compañía.', 1, '48.00'),
(12, 1, 'Shazam', 'David F. Sandberg', 0, 137, 'Ingles/Español', 'Estados Unidos', 'B', '2019', 'Ciencia Ficción', 'https://www.youtube.com/watch?time_continue=1&v=AU1L6TdRPK0', 'shazam.jpg', 'Todos llevamos un superhéroe dentro, solo se necesita un poco de magia para sacarlo a la luz. Cuando Billy Batson, un niño de acogida de 14 años que ha crecido en las calles, grita la palabra \'SHAZAM!\' se convierte en el Superhéroe adulto Shazam, por cortesía de un antiguo mago. Dentro de un cuerpo musculoso y divino, Shazam esconde un corazón de niño. Pero lo mejor es que en esta versión de adulto consigue realizar todo lo que le gustaría hacer a cualquier adolescente con superpoderes: ¡Divertirse con ellos! ¿Volar? ¿Tener visión de rayos X?', 1, '48.00');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `roles`
--

DROP TABLE IF EXISTS `roles`;
CREATE TABLE IF NOT EXISTS `roles` (
  `idRol` int(11) NOT NULL AUTO_INCREMENT,
  `rol` varchar(45) NOT NULL,
  PRIMARY KEY (`idRol`),
  UNIQUE KEY `idRol_UNIQUE` (`idRol`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `roles`
--

INSERT INTO `roles` (`idRol`, `rol`) VALUES
(1, 'Administrador'),
(2, 'Cliente');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

DROP TABLE IF EXISTS `usuarios`;
CREATE TABLE IF NOT EXISTS `usuarios` (
  `idUsuario` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) NOT NULL,
  `apellidoPaterno` varchar(45) NOT NULL,
  `apellidoMaterno` varchar(45) NOT NULL,
  `usuario` varchar(45) NOT NULL,
  `contrasenia` varchar(45) NOT NULL,
  `telefono` varchar(45) DEFAULT NULL,
  `correo` varchar(45) DEFAULT NULL,
  `sesion` int(11) NOT NULL,
  `idRol` int(11) NOT NULL,
  PRIMARY KEY (`idUsuario`),
  UNIQUE KEY `idUsuario_UNIQUE` (`idUsuario`)
) ENGINE=InnoDB AUTO_INCREMENT=31 DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`idUsuario`, `nombre`, `apellidoPaterno`, `apellidoMaterno`, `usuario`, `contrasenia`, `telefono`, `correo`, `sesion`, `idRol`) VALUES
(1, 'Antonio', 'Gonzalez', 'Ruiz', 'admin', '21232f297a57a5a743894a0e4a801fc3', '56425122', 'agr@gmail.com', 1, 1),
(2, 'Jose', 'Lopez', 'Lopez', 'Jose', '662eaa47199461d01a623884080934ab', '56871245', 'jose@gmail.com', 1, 2);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
