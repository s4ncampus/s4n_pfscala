#!/usr/bin/ruby

def gcd(x,y)
  until x == y
    if x > y
      x = x - y
    else
      y = y - x
    end
  end
  x
end

puts "Escriba dos valores enteros separados por espacios: "
s1,s2 = gets.chomp.split

a = s1.to_i
b = s2.to_i

puts "gcd(#{a},#{b})=#{gcd(a,b)}"

