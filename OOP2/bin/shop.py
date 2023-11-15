from pip._vendor.typing_extensions import NoReturn
class FruitShop:
    def __init__(self, name, price):
        self.name = name
        self.price = price
        print("Welcome to %s fruit shop"% (name))
    
    def getCostPerKg(self, fruit):
        if fruit not in self.price:
            NoReturn
        return self.price[fruit]

    def getPriceOrder(self, orderList):
        totalCost = 0.0
        for fruit, numKg in orderList:
            costPerKg = self.getCostPerKg(fruit)
            if costPerKg != None:
                totalCost += numKg * costPerKg
            return totalCost
    
    def getName(self):
        return self.name