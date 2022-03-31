package by.tc.task01.service.impl;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.dao.DAOFactory;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Product;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.service.ApplianceService;
import by.tc.task01.service.validation.Validator;

import java.util.List;

public class ApplianceServiceImpl implements ApplianceService{

	@Override
	public List<Product> find(Criteria criteria) {
		if (!Validator.validateUserCriteria(criteria)) {
			throw new RuntimeException("User's search criteria did not pass the validation.");
		}

		DAOFactory factory = DAOFactory.getInstance();
		ApplianceDAO applianceDAO = factory.getApplianceDAO();

		return applianceDAO.find(criteria);
	}
}



