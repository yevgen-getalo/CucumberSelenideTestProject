package search;
public interface Elements {
    String INPUT_FIELD = "//input[@name='q']";
    String SEARCH_BUTTON = "//input[@name='btnK']";
    String GOOGLE_SEARCH_PAGE = "https://www.google.com";
    String SEARCH_CATEGORY_BUTTON = "//button[@aria-controls=\"SearchDropdown-list\"]";
    String SEARCH_CATEGORY = "//div[@id='SearchDropdown-list']//div[1]//button[5]";
    String SEARCH_INPUT_FIELD = "//input[@id='global-search-input']";
    String SEARCH_VALUE = "//a[@title='$']";
    String BOOK_FORMAT = "//span[contains(@title,'Book Format $,')]//div[@class='option-overlay']";
    String ADD_TOCART_BUTTON = "//span[@class='spin-button-children']";
    String VIEW_CART_BUTTON = "//span[contains(text(),'View cart')]";
    String NUMBER_OF_ITEMS_IN_CART = "//h1[@aria-label='Your cart:  $ item']";
    String ITEM_NAME_IN_CART = "//a[@aria-label='$']";
}
