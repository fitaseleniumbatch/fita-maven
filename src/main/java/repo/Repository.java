package repo;

public interface Repository {
    String IMG_PATH = "//img[contains(@src, 'pets')]";
    String VET_MENU_BUTTON = "a[title='veterinarians']";
    String LIST_OF_VETS = "table#vets tbody tr";
    String ALL_OWNERS_MENU_BUTTON = "a[title='find owners']";
    String OWNER_SUBMIT_BUTTON = "//button[@type='submit']";
    String LIST_OF_OWNERS = "table#owners tbody tr";
    String ADD_OWNER_BUTTON = "//a[text()='Add Owner']";
    String ADD_NEW_PET_BUTTON = "//a[contains(text(), 'New Pet')]";
    String NEW_OWNER_DETAILS = "table tbody tr td";
}
