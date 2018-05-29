-- phpMyAdmin SQL Dump
-- version 4.6.5.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 29, 2018 at 06:57 AM
-- Server version: 10.1.21-MariaDB
-- PHP Version: 5.6.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `codersofbabylon2`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `adminID` int(11) NOT NULL,
  `firstName` varchar(100) NOT NULL,
  `lastName` varchar(100) NOT NULL,
  `middleName` varchar(100) NOT NULL,
  `username` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`adminID`, `firstName`, `lastName`, `middleName`, `username`, `password`) VALUES
(1, 'Mark', 'Ticzon', 'Velandres', 'markticzon', '**123**');

-- --------------------------------------------------------

--
-- Table structure for table `icd`
--

CREATE TABLE `icd` (
  `icdID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `medicalresults`
--

CREATE TABLE `medicalresults` (
  `fileID` int(11) NOT NULL,
  `fileUpload` tinyblob NOT NULL,
  `fileUploadContentType` varchar(255) NOT NULL,
  `fileUploadFileName` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `medicalstatus`
--

CREATE TABLE `medicalstatus` (
  `patientID` int(11) NOT NULL,
  `medicalStatusid` int(11) NOT NULL,
  `bloodPressure` float NOT NULL,
  `prcr` float NOT NULL,
  `repiratoryRate` float NOT NULL,
  `temperature` float NOT NULL,
  `weight` float NOT NULL,
  `height` float NOT NULL,
  `headCircumference` float NOT NULL,
  `chestCircumference` float NOT NULL,
  `Abdominal` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `patient`
--

CREATE TABLE `patient` (
  `patientID` int(11) NOT NULL,
  `firstName` varchar(100) NOT NULL,
  `lastName` varchar(100) NOT NULL,
  `middleName` varchar(1000) NOT NULL,
  `birthDay` varchar(30) NOT NULL,
  `gender` varchar(10) NOT NULL,
  `birthPlace` varchar(100) NOT NULL,
  `citizenship` varchar(50) NOT NULL,
  `religion` varchar(100) NOT NULL,
  `civil` varchar(50) NOT NULL,
  `job` varchar(50) NOT NULL,
  `contactNo1` varchar(50) NOT NULL,
  `contactNo2` varchar(50) NOT NULL,
  `contactNo3` varchar(50) NOT NULL,
  `type1` varchar(50) NOT NULL,
  `type2` varchar(50) NOT NULL,
  `type3` varchar(50) NOT NULL,
  `email` varchar(100) NOT NULL,
  `street` varchar(100) NOT NULL,
  `city` varchar(100) NOT NULL,
  `country` varchar(100) NOT NULL,
  `zipcode` varchar(50) NOT NULL,
  `emcFirstName` varchar(100) NOT NULL,
  `emcLastName` varchar(100) NOT NULL,
  `emcMiddleName` varchar(100) NOT NULL,
  `emcContactNo` varchar(100) NOT NULL,
  `relationship` varchar(100) NOT NULL,
  `isAlive` tinyint(1) NOT NULL,
  `patientCardID` varchar(10) NOT NULL,
  `pinID` varchar(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `patient`
--

INSERT INTO `patient` (`patientID`, `firstName`, `lastName`, `middleName`, `birthDay`, `gender`, `birthPlace`, `citizenship`, `religion`, `civil`, `job`, `contactNo1`, `contactNo2`, `contactNo3`, `type1`, `type2`, `type3`, `email`, `street`, `city`, `country`, `zipcode`, `emcFirstName`, `emcLastName`, `emcMiddleName`, `emcContactNo`, `relationship`, `isAlive`, `patientCardID`, `pinID`) VALUES
(1, 'Mark Luis Gabriel', 'Ticzon', 'V.', '20', 'M', 'Quezon City', 'filipino', 'Christianity', 'single', 'Student', '09088883208', '09494334663', '', 'Cellphone', 'Home', 'N/A', 'markvticzon@gmail.com', 'San Joaquin', 'Mandaluyong City', 'Philippines', '1001', 'Melody', 'Ticzon', 'Velandres', '09158562992', 'Mother', 1, '2785382128', ''),
(2, 'Mark Luis Gabriel', 'Ticzon', 'V.', '20', 'M', 'Quezon City', 'filipino', 'Christianity', 'single', 'Student', '09088883208', '', '', 'Home', 'N/A', 'N/A', 'markvticzon@gmail.com', 'Mandaluyong City', 'Mandaluyong City', 'Philippines', '1001', 'Melody', 'Ticzon', 'Velandres', '09158562992', 'Mother', 1, '2785382128', ''),
(3, 'Mark Luis Gabriel', 'Ticzon', 'Velandres', '6', 'M', 'Quezon City', 'filipino', 'Christianity', 'single', 'Student', '09494334664', '', '', 'Home', 'N/A', 'N/A', 'markvticzon@gmail.com', 'San Joaquin', 'Mandaluyong', 'Philippines', '1550', 'Melody', 'Ticzon', 'Velandres', '09494334663', 'Mother', 1, '2785382128', '4451'),
(20181722, 'Mark Luis Gabriel', 'Ticzon', 'V.', '20', 'M', 'Quezon City', 'filipino', 'Christianity', 'single', 'Student', '09159324417', '', '', 'Cellphone', 'N/A', 'N/A', 'markvticzon@gmail.com', 'San Joaquin', 'Mandaluyong City', 'Philippines', '1001', 'Melody', 'Ticzon', 'Velandres', '09158562992', 'Mother', 1, '2785382128', '4694'),
(20186572, 'Isaac Glenn', 'Jaranilla', 'Defiesta', '12', 'M', 'Saudi Arabia', 'filipino', 'Christianity', 'single', 'Student', '09159324417', '', '', 'Cellphone', 'N/A', 'N/A', 'isaacglenn.jaranilla@yaho.com', 'Lot 2 Block 5, Camia', 'Pasig City', 'Philippines', '1800', 'Aileen', 'Jaranilla', 'Defiesta', '09158562992', 'Mother', 1, '2785382128', '8680'),
(20187589, 'Juan', 'Dela Cruz', 'Zero', '12', 'M', 'Quezon City', 'filipino', 'Christianity', 'single', 'Student', '09088883208', '', '', 'Cellphone', 'N/A', 'N/A', 'juan.delacruz@email.com', 'H.V Dela Costa', 'Makati City', 'Philippines', '1630', 'Felipe', 'Ocampo', 'N/A', '09158562992', 'Guardian', 1, '2785287632', '2176'),
(20188411, 'Mark Luis Gabriel', 'Ticzon', 'V.', '29', 'M', 'Quezon City', 'filipino', 'Christianity', 'single', 'Student', '09159324417', '', '', 'Home', 'N/A', 'N/A', 'markvticzon@gmail.com', 'San Joaquin', 'Mandaluyong City', 'Philippines', '1001', 'Melody', 'Ticzon', 'Velandres', '09158562992', 'Mother', 1, '2785382128', '4451'),
(20188485, 'Mark Luis Gabriel', 'Ticzon', 'V.', '1998-02-17', 'M', 'Quezon City', 'filipino', 'Christianity', 'single', 'Student', '09159324417', '', '', 'Cellphone', 'N/A', 'N/A', 'markvticzon@gmail.com', 'Mandaluyong City', 'Mandaluyong City', 'Philippines', '1001', 'Melody', 'Ticzon', 'V.', '09158562992', 'Mother', 1, '2785382128', '7556'),
(20188838, 'Gabriel', 'Ticzon', 'Zero', '7', 'M', 'Quezon City', 'filipino', 'Christianity', 'single', 'Student', '09494334664', '', '', 'Cellphone', 'N/A', 'N/A', 'gabriel@email.com', 'San Joaquin', 'Mandaluyong', 'Philippines', '1550', 'Charlie', 'Zero', 'One', '09494334663', 'Sibling', 1, '2785382128', '4815');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`adminID`);

--
-- Indexes for table `icd`
--
ALTER TABLE `icd`
  ADD PRIMARY KEY (`icdID`);

--
-- Indexes for table `medicalresults`
--
ALTER TABLE `medicalresults`
  ADD PRIMARY KEY (`fileID`);

--
-- Indexes for table `medicalstatus`
--
ALTER TABLE `medicalstatus`
  ADD PRIMARY KEY (`medicalStatusid`);

--
-- Indexes for table `patient`
--
ALTER TABLE `patient`
  ADD PRIMARY KEY (`patientID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `admin`
--
ALTER TABLE `admin`
  MODIFY `adminID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT for table `icd`
--
ALTER TABLE `icd`
  MODIFY `icdID` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `medicalresults`
--
ALTER TABLE `medicalresults`
  MODIFY `fileID` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `medicalstatus`
--
ALTER TABLE `medicalstatus`
  MODIFY `medicalStatusid` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `patient`
--
ALTER TABLE `patient`
  MODIFY `patientID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=20188839;
--
-- Constraints for dumped tables
--

--
-- Constraints for table `medicalresults`
--
ALTER TABLE `medicalresults`
  ADD CONSTRAINT `medicalresults_ibfk_1` FOREIGN KEY (`fileID`) REFERENCES `patient` (`patientID`) ON DELETE CASCADE ON UPDATE CASCADE;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
