-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 16-05-2023 a las 02:39:14
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `a_ver_si_se_conecta`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `acerca_de`
--

CREATE TABLE `acerca_de` (
  `id` bigint(20) NOT NULL,
  `descripcion` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `acerca_de`
--

INSERT INTO `acerca_de` (`id`, `descripcion`) VALUES
(1, 'Estudiante de programación, aficionado a la tecnología y a entender cómo funcionan todas las cosas');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `acerca_de_seq`
--

CREATE TABLE `acerca_de_seq` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `acerca_de_seq`
--

INSERT INTO `acerca_de_seq` (`next_val`) VALUES
(51);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `educacion`
--

CREATE TABLE `educacion` (
  `id` bigint(20) NOT NULL,
  `carrera` varchar(255) DEFAULT NULL,
  `escuela` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `educacion`
--

INSERT INTO `educacion` (`id`, `carrera`, `escuela`) VALUES
(53, 'Fundamentos de la programación', 'UTN'),
(54, 'Formación Oracle ONE', 'Alura Latam'),
(55, 'Desarrollador Full-Stack Jr.', 'Argentina Programa'),
(56, 'Tecnicatura en medios audiovisuales', 'Universidad Nacional de Tucumán');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `educacion_seq`
--

CREATE TABLE `educacion_seq` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `educacion_seq`
--

INSERT INTO `educacion_seq` (`next_val`) VALUES
(151);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `encabezado`
--

CREATE TABLE `encabezado` (
  `id` bigint(20) NOT NULL,
  `descripcion` varchar(255) DEFAULT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  `perfil` varchar(255) DEFAULT NULL,
  `portada` varchar(255) DEFAULT NULL,
  `residencia` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `encabezado`
--

INSERT INTO `encabezado` (`id`, `descripcion`, `nombre`, `perfil`, `portada`, `residencia`) VALUES
(203, 'Programador Full-Stack', 'Esteban Daniel Olea', 'https://static.vecteezy.com/system/resources/previews/016/896/293/original/cute-hamster-sits-on-the-ground-under-a-rainbow-flat-illustration-vector.jpg', 'https://www.thesoftwareguild.com/wp-content/uploads/2016/10/1800x682-firstproglang-header-SWG.jpg', 'Tucumán (Argentina)');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `encabezado_seq`
--

CREATE TABLE `encabezado_seq` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `encabezado_seq`
--

INSERT INTO `encabezado_seq` (`next_val`) VALUES
(301);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `habilidades`
--

CREATE TABLE `habilidades` (
  `id` bigint(20) NOT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  `valor` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `habilidades`
--

INSERT INTO `habilidades` (`id`, `nombre`, `valor`) VALUES
(1, 'SQL', '35'),
(2, 'JAVA', '75'),
(3, 'Javascript', '75');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `habilidades_seq`
--

CREATE TABLE `habilidades_seq` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `habilidades_seq`
--

INSERT INTO `habilidades_seq` (`next_val`) VALUES
(101);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `acerca_de`
--
ALTER TABLE `acerca_de`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `educacion`
--
ALTER TABLE `educacion`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `encabezado`
--
ALTER TABLE `encabezado`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `habilidades`
--
ALTER TABLE `habilidades`
  ADD PRIMARY KEY (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
