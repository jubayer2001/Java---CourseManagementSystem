# Java---CourseManagementSystem
A Course Management System (CMS) with JavaFX GUI, featuring:

User roles: Admin, Instructor, Student

Data persistence: Uses DataHandler for serialization

Navigation: Multiple FXML scenes for different functionalities

I've reviewed the provided JavaFX application files for a Course Management System. Here's a summary of the key components:

### Core Structure:
1. **Main.java** - Entry point that:
   - Initializes the CourseManagementSystem (CMS)
   - Loads saved data or creates new data if none exists
   - Sets up the primary stage with login.fxml

2. **Login System**:
   - `loginController.java` handles authentication with:
     - Direct admin access via "a-1234"
     - User type detection (Admin/Instructor/Student)
     - Navigation to appropriate dashboards
   - Signup functionality (though signup.fxml isn't provided)

3. **Admin Functionality**:
   - `adminPageController.java` manages the admin dashboard with actions for:
     - Adding users/courses
     - Viewing data
     - Course registration/offering
     - Logout
   - `addCourseController.java` handles course creation
   - `addUserController.java` handles user creation (Admin/Instructor/Student)

### Key Features:
- Data persistence using DataHandler
- Role-based access control
- Clean UI separation via FXML files
- Proper MVC architecture with controller-FXML pairing

### Notable Implementation Details:
1. The system uses a hardcoded admin ID ("a-1234") as a backdoor
2. All admin operations automatically persist data via `DataHandler.saveData()`
3. User creation differentiates between roles (admin/instructor/student)
4. Navigation is handled consistently through scene changes

### Potential Improvements:
1. The CSS file is empty - could add styling rules
2. Some controllers mix Swing's JOptionPane with JavaFX (inconsistent)
3. Error handling could be more user-friendly
4. Some method implementations are missing (like search functionality)

The code shows a solid foundation for a course management system with proper separation of concerns between the UI (FXML), controllers, and business logic (UAP package, though those files weren't provided). The navigation flow between different screens is well implemented using FXMLLoader.
