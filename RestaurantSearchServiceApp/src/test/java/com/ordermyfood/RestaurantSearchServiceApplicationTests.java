package com.ordermyfood;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

import com.ordermyfood.entity.MenuItem;
import com.ordermyfood.entity.Restaurant;
import com.ordermyfood.repository.MenuItemRepository;
import com.ordermyfood.repository.RestaurantRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes= { RestaurantSearchServiceApplicationTests.class})
class RestaurantSearchServiceApplicationTests {
	

	@MockBean
	private RestaurantRepository restaurantRepository;
	private MenuItemRepository menuItemRepository;

	@Test
	public void createRestaurantTest() {
		Restaurant restaurant = new Restaurant("3", "3A", "Burp","BEL road","Chinese",15,3000);
		
		when(restaurantRepository.save(restaurant)).thenReturn(restaurant);
		assertNotNull(restaurant);	
	}
	
	@Test
	public void testgetRestaurentByName()
	{
		String name="Burp";
		Restaurant restaurant=(Restaurant) restaurantRepository.findByName(name);
		//Assert the response
		assertThat(restaurant.getRestaurantName()).isEqualTo(name);
	}
	@Test
	public void testgetRestaurentByLocation()
	{
		String location="BEL road";
		Restaurant restaurant=(Restaurant) restaurantRepository.findByLocation(location);
		//Assert the response
		assertThat(restaurant.getRestaurantlocation()).isEqualTo(location);
	}
	@Test
	public void testgetRestaurantByDistance()
	{
		int distance=15;
		Restaurant restaurant=(Restaurant) restaurantRepository.findByDistance(distance);
		//Assert the response
		assertThat(restaurant.getDistance()).isEqualTo(distance);
	}
	@Test
	public void testgetRestaurantByBudget()
	{
		int budget=3000;
		Restaurant restaurant=(Restaurant) restaurantRepository.findByBudget(budget);
		//Assert the response
		assertThat(restaurant.getBudget()).isEqualTo(budget);
	}
	@Test
	public void testgetRestaurantByCuisine()
	{
		String cuisine="Chinese";
		Restaurant restaurant=(Restaurant) restaurantRepository.findByCuisine(cuisine);
		//Assert the response
		assertThat(restaurant.getCuisine()).isEqualTo(cuisine);
	}
	@Test
	public void testCreateMenuItems()
	{
		MenuItem menuItem=new MenuItem("10","101A","Gobi","spicyfood",200);
		MenuItem savedMenuItem=menuItemRepository.save(menuItem);
		assertNotNull(savedMenuItem);
	}
	@Test
	public void testFindByName()
	{
		String name="Gobi";
		MenuItem menuItem=(MenuItem) menuItemRepository.findByRestaurantName(name);
		assertThat(menuItem.getItemName()).isEqualTo(name);
	}
}
	
	