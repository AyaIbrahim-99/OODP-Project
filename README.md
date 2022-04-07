# OODP-Project
Project Management System

Assumptions:

• Project management system has a single CEO.

• The CEO manages departments and managers.

• A manager manages team members, projects, resources an tasks.

• A team member updates task info.

Design Patterns:
• Singleton

The project management system has only one CEO user to make sure that a single object gets created we applied the singleton pattern on CEO class.

• Factory
During the registration process, members differ from being team members and managers; according to their job title the factory class handles the object creation.
• State
Resource can be available or reserved by a task to change the state of a resource we used the state design pattern.
• Strategy
During login the user type is known during runtime which we handeled using strategy design pattern.
• Command
Managers use the system to request different commands to be applied on projects such as adding, deleting and editing. We used the command pattern to receive the request and pass it to the suitable concrete command class for execution.
