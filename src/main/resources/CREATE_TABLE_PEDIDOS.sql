CREATE TABLE
    `bd_ejercicio3`.`pedidos` (
        `idPedidos` INT NOT NULL,
        `codigoProducto` INT NULL,
        `unidades` INT NULL,
        `total` DOUBLE NULL,
        `fecha` DATETIME NULL,
        PRIMARY KEY (`idPedidos`),
        INDEX `FK_PRODUCTOS_CODIGO_PRODUCTO_idx` (`codigoProducto` ASC) VISIBLE,
        CONSTRAINT `FK_PRODUCTOS_CODIGO_PRODUCTO` FOREIGN KEY (`codigoProducto`) REFERENCES `bd_ejercicio3`.`productos` (`codigoProducto`) ON DELETE CASCADE ON UPDATE CASCADE
    );