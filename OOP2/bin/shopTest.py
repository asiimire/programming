import shop

shopName = "Zoe shop"
fruitPrice = {
    'apples': 1000,
    'oranges': 500,
    'pears': 400
    }
zoeShop = shop.FruitShop(shopName, fruitPrice)
applePrice = zoeShop.getCostPerKg("apples")
print(applePrice)
print(f"Apples cost sh.{applePrice} at {shopName}")
print("Apples cost sh.%.2f at %s" %(applePrice, shopName))