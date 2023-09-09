-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 09-09-2023 a las 20:21:39
-- Versión del servidor: 10.4.24-MariaDB
-- Versión de PHP: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `examen_visual`
--
CREATE DATABASE examen_visual DEFAULT CHARACTER SET utf8 COLLATE utf8_spanish_ci;
USE examen_visual;
-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `libros_pedidos`
--

CREATE TABLE `libros_pedidos` (
  `id` int(11) NOT NULL,
  `titulo` varchar(100) NOT NULL,
  `autores` varchar(50) NOT NULL,
  `ISBN` varchar(50) NOT NULL,
  `solicitante` int(11) NOT NULL,
  `proveedor` int(11) NOT NULL,
  `fechaPedido` date NOT NULL,
  `fechaEntregado` date NOT NULL,
  `precio` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `libros_pedidos`
--

INSERT INTO `libros_pedidos` (`id`, `titulo`, `autores`, `ISBN`, `solicitante`, `proveedor`, `fechaPedido`, `fechaEntregado`, `precio`) VALUES
(24, 'CSS desde', 'Rodriguez', 'e', 2, 1, '2023-08-10', '2023-08-23', '78'),
(33, 'Base de datos', 'Jimenez', '15-23', 2, 4, '2023-08-03', '2023-08-10', '20'),
(34, 'sfe', 'sdf', '45', 1, 1, '2023-08-04', '2023-08-04', '45');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `proveedor`
--

CREATE TABLE `proveedor` (
  `id` int(11) NOT NULL,
  `empresa` varchar(50) NOT NULL,
  `direccion` varchar(50) NOT NULL,
  `telefono` varchar(50) NOT NULL,
  `fax` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `proveedor`
--

INSERT INTO `proveedor` (`id`, `empresa`, `direccion`, `telefono`, `fax`) VALUES
(1, 'Aztecas', 'Perú', '923083233', '9332-234'),
(2, 'Cali', 'México', '939323484', ''),
(3, 'Santiago', 'Argentina', '988677445', '879-8'),
(4, 'Iquitos', 'Ecuador', '988677445', '879-8'),
(5, 'PeruSAC', 'Lima', '943125768', '879-2'),
(6, 'EspañaED', 'Madrid', '943125687', '879-1'),
(11, 'Dinamarca', '', '', ''),
(12, 'Computer Tools', 'Yungay', '923022029', '023-23'),
(13, 'Jorge SAC', 'Yungay', '9230230283', 'fds'),
(14, 'fer', 'sdf', 'fds', 'sdf');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE `usuario` (
  `id` int(100) NOT NULL,
  `apellidos` varchar(50) NOT NULL,
  `nombres` varchar(50) NOT NULL,
  `usuario` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `direccion` varchar(50) NOT NULL,
  `telefono` varchar(50) NOT NULL,
  `correo` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `usuario`
--

INSERT INTO `usuario` (`id`, `apellidos`, `nombres`, `usuario`, `password`, `direccion`, `telefono`, `correo`) VALUES
(1, 'Jimenes Milla', 'Jorge Alex', 'jorge', '123', 'Piura', '943125768', 'jimenes_milla@gmail.com'),
(2, 'Mendez Acuña', 'Roberto Jesus', 'roberto', '123', 'Cajamarca', '943125687', 'pablo_acuña@gmail.com'),
(3, 'Paredes Sanchez', 'Andres Ivan', 'andres', '1234', 'Lima', '949163757', 'andresparedessanches@gmail.com'),
(4, 'Ramirez Jimenez', 'Gustavo Alex', 'gustavo', '123', 'Piura', '941275863', 'gustavo_alex@gmail.com'),
(5, 'Garcia Loyola', 'Oscar Carlos', 'oscar', '123', 'Piura', '943125768', 'jimenes_milla@gmail.com'),
(7, 'Jimenez', 'Jorge', 'jorge', '55555', 'Trujillo', '923283084', 'jorgemilla@gmail.com');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `libros_pedidos`
--
ALTER TABLE `libros_pedidos`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `proveedor`
--
ALTER TABLE `proveedor`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `libros_pedidos`
--
ALTER TABLE `libros_pedidos`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=35;

--
-- AUTO_INCREMENT de la tabla `proveedor`
--
ALTER TABLE `proveedor`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;

--
-- AUTO_INCREMENT de la tabla `usuario`
--
ALTER TABLE `usuario`
  MODIFY `id` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
