module Main where

import System.IO(hPutStrLn,stdout,hFlush,hGetLine,stdin,hPutStr)
import System.IO.Error(IOError(..),catchIOError)
import System.Exit(exitSuccess)

gcd' :: Int -> Int -> Int
gcd' x y
  | x ==  y   = x
  | x <   y   = gcd' x       (y - x)
  | otherwise = gcd' (x - y) y

readInts :: IO (Int,Int,Int)
readInts = do
 str <- hGetLine stdin
 let [s1,s2,s3] = words str
 return (read s1, read s2, read s3)


process :: IO ()
process = do 
  hPutStr stdout "Enter three integer values separated by spaces: "
  hFlush stdout
  (a,b,c) <- readInts
  hPutStrLn stdout $ "The minimum size to cut is: "
                   ++ (show $ gcd' c (gcd' a b))
  return ()

main :: IO ()
main = do
  catchIOError process (\e -> do exitSuccess)
  main
