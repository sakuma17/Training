-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- ホスト: 127.0.0.1
-- 生成日時: 2020-12-17 06:55:12
-- サーバのバージョン： 10.4.13-MariaDB
-- PHP のバージョン: 7.4.7

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- データベース: `sales_app`
--

-- --------------------------------------------------------

--
-- テーブルの構造 `deps`
--

CREATE TABLE `deps` (
  `id` int(11) NOT NULL,
  `dep` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- テーブルのデータのダンプ `deps`
--

INSERT INTO `deps` (`id`, `dep`) VALUES
(1, '営業1課'),
(2, '営業2課'),
(3, '経理部'),
(4, '総務部'),
(5, '人事部');

-- --------------------------------------------------------

--
-- テーブルの構造 `emps`
--

CREATE TABLE `emps` (
  `id` int(11) NOT NULL,
  `name` varchar(30) NOT NULL,
  `age` int(11) DEFAULT NULL,
  `dep_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- テーブルのデータのダンプ `emps`
--

INSERT INTO `emps` (`id`, `name`, `age`, `dep_id`) VALUES
(1, '佐藤', 40, 3),
(2, '高橋', 28, 1),
(3, '中川', 20, 2),
(4, '渡辺', 20, 1),
(5, '西澤', 36, 4),
(6, '中村', 26, 2),
(7, '田中', 24, 2),
(8, '鈴木', 42, 5),
(9, '山田', 22, 1);

-- --------------------------------------------------------

--
-- テーブルの構造 `sales`
--

CREATE TABLE `sales` (
  `id` int(11) NOT NULL,
  `emp_id` int(11) DEFAULT NULL,
  `sale` int(11) DEFAULT NULL,
  `s_date` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- テーブルのデータのダンプ `sales`
--

INSERT INTO `sales` (`id`, `emp_id`, `sale`, `s_date`) VALUES
(1, 3, 100, '2017-09-01'),
(2, 8, 63, '2017-09-01'),
(3, 2, 82, '2017-09-01'),
(4, 1, 32, '2017-09-02'),
(5, 5, 98, '2017-09-02'),
(6, 3, 87, '2017-09-03'),
(7, 3, 66, '2017-09-03'),
(8, 1, 42, '2017-09-03'),
(9, 6, 164, '2017-09-04'),
(10, 2, 28, '2017-09-04'),
(11, 3, 35, '2017-09-04'),
(12, 5, 43, '2017-09-05'),
(13, 4, 26, '2017-09-05'),
(14, 3, 83, '2017-09-05'),
(15, 8, 55, '2017-09-05');

--
-- ダンプしたテーブルのインデックス
--

--
-- テーブルのインデックス `deps`
--
ALTER TABLE `deps`
  ADD PRIMARY KEY (`id`);

--
-- テーブルのインデックス `emps`
--
ALTER TABLE `emps`
  ADD PRIMARY KEY (`id`);

--
-- テーブルのインデックス `sales`
--
ALTER TABLE `sales`
  ADD PRIMARY KEY (`id`);

--
-- ダンプしたテーブルのAUTO_INCREMENT
--

--
-- テーブルのAUTO_INCREMENT `deps`
--
ALTER TABLE `deps`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- テーブルのAUTO_INCREMENT `emps`
--
ALTER TABLE `emps`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- テーブルのAUTO_INCREMENT `sales`
--
ALTER TABLE `sales`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=17;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
