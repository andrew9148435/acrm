package com.andrew;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class App {

    public static void main( String[] args ) {
        System.out.println( "Hello World!" );


        AbstractApplicationContext context = new AnnotationConfigApplicationContext(PersistenceConfig.class);
        Main main = (Main) context.getBean("qq");

//        Main main = new Main();
        main.perform();

//        attributeServiceImpl.getAttributeDao().add(attribute);


/*        HibernateUtil hibernateUtil = new HibernateUtil();
        Session session = hibernateUtil.getSessionFactory().openSession();


        session.beginTransaction();

        Attribute attribute = new Attribute();
        attribute.setName("aasd");
        session.replicate(attribute, ReplicationMode.OVERWRITE);


        CategoryAttribute categoryAttribute = new CategoryAttribute();
        categoryAttribute.setAttribute(attribute);

        Category category = new Category();
        category.setId(1);
        category.setName("ttttt");
        session.replicate(category, ReplicationMode.OVERWRITE);

        categoryAttribute.setCategory(category);
        session.replicate(categoryAttribute, ReplicationMode.OVERWRITE);


        Product product = new Product();

        ProductCategory productCategory = new ProductCategory();
        productCategory.setProduct(product);
        productCategory.setCategory(category);
        product.setName("prpr");
        product.setProductCategory(productCategory);
        session.replicate(product, ReplicationMode.OVERWRITE);


        ProductAttribute productAttribute = new ProductAttribute();
        productAttribute.setAttribute(attribute);
        productAttribute.setProduct(product);
        session.replicate(productAttribute, ReplicationMode.OVERWRITE);

        product.getProductAttributes().add(productAttribute);

        Tag tag = new Tag();
        tag.setName("tag");
        session.replicate(tag, ReplicationMode.OVERWRITE);

        ProductTag productTag = new ProductTag();
        productTag.setTag(tag);
        productTag.setProduct(product);


        session.replicate(productTag, ReplicationMode.OVERWRITE);



        session.saveOrUpdate(product);

        session.getTransaction().commit();
        session.close();*/






//        Query query = session.createNativeQuery("select * from attributes");
//        List result = query.getResultList();
//        System.out.println(result.get(2));

/*        List<Object[]> attrs = session.createNativeQuery(
                "select * from attributes" )
                .getResultList();

        for(Object[] person : attrs) {
            Number id = (Number) person[0];
            String name = (String) person[1];
            System.out.println(person[1]);
        }

        System.out.println(attrs.get(2));*/


/*        List<CategoryAttribute> attrs = session.createNativeQuery(
                "select * from product_attributes", CategoryAttribute.class )
                .getResultList();*/

//        for(CategoryAttribute phone : attrs) {
//            System.out.println(phone.getId());
//        }

//        System.out.println(attrs.get(2).getId());




//        Folder root = new Folder();
//        root.setName("root1");
//        Tree<Folder> tree = new Tree(root);
//        tree.addNode("root", "ass");
//        tree.addNode("root", "zaa");
//        System.out.println(tree.getRoot().getData().getName());



//        Node<Folder> node = new Node<Folder>("first", new Folder());
//        tree.addNode("root", node);
//        tree.getNode("first").getData().setName("zzzz");
//        System.out.println(tree.getNode("first").getData().getName());


//        Query query = session.createSQLQuery(
//                "select s.stock_code from stock s where s.stock_code = :stockCode")
//                .setParameter("stockCode", "7277");
//        List result = query.list();


    }
}
