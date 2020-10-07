
gcd' :: Int -> Int -> Int
gcd' x y
  | x ==  y   = x
  | x <   y   = gcd' x       (y - x)
  | otherwise = gcd' (x - y) y
