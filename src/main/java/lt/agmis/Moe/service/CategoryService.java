package lt.agmis.Moe.service;

import lt.agmis.Moe.domain.Category;
import lt.agmis.Moe.dto.CategoryListWrapper;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: ignas
 * Date: 10/3/13
 * Time: 3:05 PM
 * To change this template use File | Settings | File Templates.
 */
public interface CategoryService {
    List<Category> getCategories();
    int storeCategory(Category category);
    void deleteCategory(int id);
    void updateCategory(int id, Category category);
}
