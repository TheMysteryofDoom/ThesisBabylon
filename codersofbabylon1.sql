-- phpMyAdmin SQL Dump
-- version 4.6.5.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 12, 2018 at 10:02 AM
-- Server version: 10.1.21-MariaDB
-- PHP Version: 5.6.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `codersofbabylon1`
--

-- --------------------------------------------------------

--
-- Table structure for table `adminaccount`
--

CREATE TABLE `adminaccount` (
  `accountID` int(11) NOT NULL,
  `username` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL,
  `email` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `patient`
--

CREATE TABLE `patient` (
  `patientID` int(11) NOT NULL,
  `firstName` varchar(100) NOT NULL,
  `lastName` varchar(100) NOT NULL,
  `middleName` varchar(100) NOT NULL,
  `birthMonth` varchar(50) NOT NULL,
  `birthDay` int(11) NOT NULL,
  `birthYear` int(11) NOT NULL,
  `gender` varchar(10) NOT NULL,
  `birthPlace` varchar(100) NOT NULL,
  `citizenship` varchar(100) NOT NULL,
  `religion` varchar(100) NOT NULL,
  `civil` varchar(50) NOT NULL,
  `job` varchar(100) NOT NULL,
  `patientStatus` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `patient`
--

INSERT INTO `patient` (`patientID`, `firstName`, `lastName`, `middleName`, `birthMonth`, `birthDay`, `birthYear`, `gender`, `birthPlace`, `citizenship`, `religion`, `civil`, `job`, `patientStatus`) VALUES
(1, 'Mark Luis Gabriel', 'Ticzon', 'Velandres', 'Oct', 20, 1998, 'M', 'Quezon City', 'filipino', 'Christianity', 'single', 'Student', 'alive');

-- --------------------------------------------------------

--
-- Table structure for table `patientaddress`
--

CREATE TABLE `patientaddress` (
  `addressID` int(11) NOT NULL,
  `street` varchar(100) NOT NULL,
  `city` varchar(100) NOT NULL,
  `country` varchar(100) NOT NULL,
  `zipcode` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `patientcontactinfo`
--

CREATE TABLE `patientcontactinfo` (
  `contactID` int(11) NOT NULL,
  `contactNo1` int(11) NOT NULL,
  `contactNo2` int(11) NOT NULL,
  `contactNo3` int(11) NOT NULL,
  `email` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `patientemergencycontact`
--

CREATE TABLE `patientemergencycontact` (
  `emergencycontactID` int(11) NOT NULL,
  `fisrtName` varchar(100) NOT NULL,
  `lastName` varchar(100) NOT NULL,
  `middleName` varchar(100) NOT NULL,
  `contactNo` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `adminaccount`
--
ALTER TABLE `adminaccount`
  ADD PRIMARY KEY (`accountID`);

--
-- Indexes for table `patient`
--
ALTER TABLE `patient`
  ADD PRIMARY KEY (`patientID`);

--
-- Indexes for table `patientaddress`
--
ALTER TABLE `patientaddress`
  ADD PRIMARY KEY (`addressID`);

--
-- Indexes for table `patientcontactinfo`
--
ALTER TABLE `patientcontactinfo`
  ADD PRIMARY KEY (`contactID`);

--
-- Indexes for table `patientemergencycontact`
--
ALTER TABLE `patientemergencycontact`
  ADD PRIMARY KEY (`emergencycontactID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `adminaccount`
--
ALTER TABLE `adminaccount`
  MODIFY `accountID` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `patient`
--
ALTER TABLE `patient`
  MODIFY `patientID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT for table `patientaddress`
--
ALTER TABLE `patientaddress`
  MODIFY `addressID` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `patientcontactinfo`
--
ALTER TABLE `patientcontactinfo`
  MODIFY `contactID` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `patientemergencycontact`
--
ALTER TABLE `patientemergencycontact`
  MODIFY `emergencycontactID` int(11) NOT NULL AUTO_INCREMENT;
--
-- Constraints for dumped tables
--

--
-- Constraints for table `patientaddress`
--
ALTER TABLE `patientaddress`
  ADD CONSTRAINT `patientaddress_ibfk_1` FOREIGN KEY (`addressID`) REFERENCES `patient` (`patientID`);

--
-- Constraints for table `patientcontactinfo`
--
ALTER TABLE `patientcontactinfo`
  ADD CONSTRAINT `patientcontactinfo_ibfk_1` FOREIGN KEY (`contactID`) REFERENCES `patient` (`patientID`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
