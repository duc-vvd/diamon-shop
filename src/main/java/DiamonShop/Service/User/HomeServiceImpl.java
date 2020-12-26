package DiamonShop.Service.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import DiamonShop.Dao.CategoriesDao;
import DiamonShop.Dao.MenuDao;
import DiamonShop.Dao.ProductsDao;
import DiamonShop.Dao.SlidesDao;
import DiamonShop.Dto.ProductsDto;
import DiamonShop.Entity.Categories;
import DiamonShop.Entity.Menu;
import DiamonShop.Entity.Slides;
@Service
public class HomeServiceImpl implements IHomeService{
	@Autowired
	private SlidesDao slidesDao;
	@Autowired
	private CategoriesDao categoriesDao;
	@Autowired
	private MenuDao menuDao;
	@Autowired
	private ProductsDao productsDao;

	public List<Slides> GetDataSlies() {
		return slidesDao.GetDataSlies();
	}

	public List<Categories> GetDataCategories() {
		return categoriesDao.GetDataCategories();
	}
	
	public List<Menu> GetDataMenu() {
		return menuDao.GetDataMenu();
	}

	public List<ProductsDto> GetDataProducts() {
		return productsDao.GetDataProducts();
	}
	
}
