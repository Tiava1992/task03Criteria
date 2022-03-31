package by.tc.task01.service.validation;

import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.SearchCriteria;

import java.util.Set;

public class Validator {

	public static boolean validateUserCriteria(Criteria criteria) {
		int numberOfUserCriteria = criteria.getCriteria().size();
		String targetClassName = criteria.getGroupSearchName();
		Set<String> userSearchCriteriaSet = criteria.getCriteria().keySet();
		int foundCriteria = 0;

		for (String currentCriteria : userSearchCriteriaSet) {
			for (Class<?> currentEnum : SearchCriteria.class.getClasses()) {
				if (currentEnum.getSimpleName().equals(targetClassName)) {
					if (findMatchesInEnum(currentEnum, currentCriteria)) {
						foundCriteria++;
					}
				}
			}
		}
		return foundCriteria == numberOfUserCriteria;
	}

	private static boolean findMatchesInEnum(Class<?> currentEnum, String currentCriteria) {
		boolean result = false;

		for (Object enumParameter : currentEnum.getEnumConstants()) {
			if (currentCriteria.equals(enumParameter.toString())) {
				result = true;
				break;
			}
		}
		return result;
	}
}

