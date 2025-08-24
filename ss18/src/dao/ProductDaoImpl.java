package dao;

import entity.Product;
import util.ConnectionDB;

import java.sql.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class ProductDaoImpl implements ProductDao{
    @Override
    public List<Product> findAll() {
        Connection connection=null;
        List<Product>products=new ArrayList<>();
        CallableStatement callableStatement=null;

        try {  connection= ConnectionDB.openConnection();
            callableStatement=connection.prepareCall("{call get_all_product()}");
           ResultSet resultSet=callableStatement.executeQuery();
            while (resultSet.next()){
                Product product=new Product();
                product.setProductId(resultSet.getInt("product_id"));
                product.setProductName(resultSet.getString("product_name"));
                product.setProductPrice(resultSet.getFloat("product_price"));
                product.setProductTitle(resultSet.getString("product_title"));
                product.setProductCreated(LocalDate.parse(resultSet.getString("product_created"), DateTimeFormatter.ofPattern("yyyy-MM-dd")));
                product.setProductCatalog(resultSet.getString("product_catalog"));
                product.setProductStatus(resultSet.getBoolean("product_status"));
                products.add(product);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
           ConnectionDB.closeConnection(connection,callableStatement);
        }
        return products;
    }

    @Override
    public boolean addProduct(Product product) {
        Connection connection=null;
        CallableStatement callableStatement=null;
boolean result=false;
        try {  connection= ConnectionDB.openConnection();
            callableStatement=connection.prepareCall("{call create_product(?,?,?,?,?,?)}");
callableStatement.setString(1,product.getProductName());
callableStatement.setFloat(2,product.getProductPrice());
callableStatement.setString(3, product.getProductTitle());
callableStatement.setDate(4, Date.valueOf(product.getProductCreated()));
callableStatement.setString(5,product.getProductCatalog());
callableStatement.setBoolean(6,product.isProductStatus());
callableStatement.executeUpdate();
result=true;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            ConnectionDB.closeConnection(connection,callableStatement);
        }return result;
    }

    @Override
    public boolean updateProduct(Product product) {
        Connection connection=null;
        CallableStatement callableStatement=null;
        boolean result=false;
        try {  connection= ConnectionDB.openConnection();
            callableStatement=connection.prepareCall("{call update_product(?,?,?,?,?,?,?)}");
            callableStatement.setInt(1,product.getProductId());
            callableStatement.setString(2,product.getProductName());
            callableStatement.setFloat(3,product.getProductPrice());
            callableStatement.setString(4, product.getProductTitle());
            callableStatement.setDate(5, Date.valueOf(product.getProductCreated()));
            callableStatement.setString(6,product.getProductCatalog());
            callableStatement.setBoolean(7,product.isProductStatus());
            callableStatement.executeUpdate();
            result=true;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            ConnectionDB.closeConnection(connection,callableStatement);
        }return result;
    }

    @Override
    public boolean deleteProduct(int id) {
        Connection connection=null;
        CallableStatement callableStatement=null;
        boolean result=false;
        try {  connection= ConnectionDB.openConnection();
            callableStatement=connection.prepareCall("{call delete_product(?)}");
            callableStatement.setInt(1,id);

            callableStatement.executeUpdate();
            result=true;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            ConnectionDB.closeConnection(connection,callableStatement);
        }return result;
    }

    @Override
    public List<Product> findByName(String name) {
        Connection connection=null;
        List<Product>products=new ArrayList<>();
        CallableStatement callableStatement=null;

        try {  connection= ConnectionDB.openConnection();
            callableStatement=connection.prepareCall("{call get_product_by_name(?)}");
            callableStatement.setString(1,name);
            ResultSet resultSet=callableStatement.executeQuery();

            while (resultSet.next()){
                Product product=new Product();
                product.setProductId(resultSet.getInt("product_id"));
                product.setProductName(resultSet.getString("product_name"));
                product.setProductPrice(resultSet.getFloat("product_price"));
                product.setProductTitle(resultSet.getString("product_title"));
                product.setProductCreated(LocalDate.parse(resultSet.getString("product_created"), DateTimeFormatter.ofPattern("yyyy-MM-dd")));
                product.setProductCatalog(resultSet.getString("product_catalog"));
                product.setProductStatus(resultSet.getBoolean("product_status"));
                products.add(product);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            ConnectionDB.closeConnection(connection,callableStatement);
        }
        return products;
    }

    @Override
    public Product findById(int id) {
        Connection connection=null;
        CallableStatement callableStatement=null;
        Product product=null;
        try {  connection= ConnectionDB.openConnection();
            callableStatement=connection.prepareCall("{call get_product_by_id(?)}");
            callableStatement.setInt(1,id);
            ResultSet resultSet=callableStatement.executeQuery();

            if (resultSet.next()){
                product=new Product();
                product.setProductId(resultSet.getInt("product_id"));
                product.setProductName(resultSet.getString("product_name"));
                product.setProductPrice(resultSet.getFloat("product_price"));
                product.setProductTitle(resultSet.getString("product_title"));
                product.setProductCreated(LocalDate.parse(resultSet.getString("product_created"), DateTimeFormatter.ofPattern("yyyy-MM-dd")));
                product.setProductCatalog(resultSet.getString("product_catalog"));
                product.setProductStatus(resultSet.getBoolean("product_status"));
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            ConnectionDB.closeConnection(connection,callableStatement);
        }
        return product;
    }
}
