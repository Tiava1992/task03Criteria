package by.tc.task01.dao;

import by.tc.task01.entity.Product;
import by.tc.task01.entity.criteria.Criteria;

import java.util.List;

public interface ApplianceDAO {
	List<Product> find(Criteria criteria);
}
