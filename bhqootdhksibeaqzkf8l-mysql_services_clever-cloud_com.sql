-- phpMyAdmin SQL Dump
-- version 4.8.4
-- https://www.phpmyadmin.net/
--
-- Host: bhqootdhksibeaqzkf8l-mysql.services.clever-cloud.com:3306
-- Generation Time: Jun 17, 2023 at 04:13 PM
-- Server version: 8.0.15-5
-- PHP Version: 7.2.34

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `bhqootdhksibeaqzkf8l`
--
CREATE DATABASE IF NOT EXISTS `bhqootdhksibeaqzkf8l` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;
USE `bhqootdhksibeaqzkf8l`;

-- --------------------------------------------------------

--
-- Table structure for table `acerca_de`
--

CREATE TABLE `acerca_de` (
  `id` bigint(20) NOT NULL,
  `descripcion` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `acerca_de`
--

INSERT INTO `acerca_de` (`id`, `descripcion`) VALUES
(1, 'Estudiante de programación, aficionado a la tecnología y a entender cómo funcionan todas las cosas');

-- --------------------------------------------------------

--
-- Table structure for table `acerca_de_seq`
--

CREATE TABLE `acerca_de_seq` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `acerca_de_seq`
--

INSERT INTO `acerca_de_seq` (`next_val`) VALUES
(51);

-- --------------------------------------------------------

--
-- Table structure for table `educacion`
--

CREATE TABLE `educacion` (
  `id` bigint(20) NOT NULL,
  `carrera` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `escuela` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `educacion`
--

INSERT INTO `educacion` (`id`, `carrera`, `escuela`) VALUES
(53, 'Fundamentos de la programación', 'UTN'),
(54, 'Formación Oracle ONE', 'Alura Latam'),
(55, 'Desarrollador Full-Stack Jr.', 'Argentina Programa'),
(56, 'Tecnicatura en medios audiovisuales', 'Universidad Nacional de Tucumán');

-- --------------------------------------------------------

--
-- Table structure for table `educacion_seq`
--

CREATE TABLE `educacion_seq` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `educacion_seq`
--

INSERT INTO `educacion_seq` (`next_val`) VALUES
(151);

-- --------------------------------------------------------

--
-- Table structure for table `encabezado`
--

CREATE TABLE `encabezado` (
  `id` bigint(20) NOT NULL,
  `descripcion` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `nombre` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `perfil` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `portada` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `residencia` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `encabezado`
--

INSERT INTO `encabezado` (`id`, `descripcion`, `nombre`, `perfil`, `portada`, `residencia`) VALUES
(203, 'Programador Full-Stack', 'Esteban Daniel Olea', 'https://static.vecteezy.com/system/resources/previews/016/896/293/original/cute-hamster-sits-on-the-ground-under-a-rainbow-flat-illustration-vector.jpg', 'https://www.thesoftwareguild.com/wp-content/uploads/2016/10/1800x682-firstproglang-header-SWG.jpg', 'Tucumán (Argentina)');

-- --------------------------------------------------------

--
-- Table structure for table `encabezado_seq`
--

CREATE TABLE `encabezado_seq` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `encabezado_seq`
--

INSERT INTO `encabezado_seq` (`next_val`) VALUES
(301);

-- --------------------------------------------------------

--
-- Table structure for table `habilidades`
--

CREATE TABLE `habilidades` (
  `id` bigint(20) NOT NULL,
  `nombre` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `valor` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `habilidades`
--

INSERT INTO `habilidades` (`id`, `nombre`, `valor`) VALUES
(1, 'SQL', '35'),
(2, 'JAVA', '75'),
(3, 'Javascript', '75');

-- --------------------------------------------------------

--
-- Table structure for table `habilidades_seq`
--

CREATE TABLE `habilidades_seq` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `habilidades_seq`
--

INSERT INTO `habilidades_seq` (`next_val`) VALUES
(101);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `acerca_de`
--
ALTER TABLE `acerca_de`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `educacion`
--
ALTER TABLE `educacion`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `encabezado`
--
ALTER TABLE `encabezado`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `habilidades`
--
ALTER TABLE `habilidades`
  ADD PRIMARY KEY (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
