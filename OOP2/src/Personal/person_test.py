from pip._vendor.typing_extensions import NoReturn
import person_class

p1 = person_class.Person(12)
p1.get_population()

p2 = person_class.Person(63)
p2.get_population()

p1.get_age()
p2.get_age()