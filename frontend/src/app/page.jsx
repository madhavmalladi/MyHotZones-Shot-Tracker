import Image from "next/image";

export default function Home() {
  return (
    <div className="min-h-screen relative flex flex-col items-center bg-black">
      {/* Background  */}
      <div className="absolute top-0 right-0 w-full md:w-1/2 h-full z-0 overflow-hidden">
        <div className="relative h-full w-full">
          <Image
            src="/shooter.jpg" 
            alt="Basketball player shooting"
            fill
            priority
            style={{ objectFit: "cover", objectPosition: "center" }}
            quality={100}
            className="opacity-80"
          />
          <div className="absolute inset-0 bg-gradient-to-l from-black/10 to-black"></div>
        </div>
      </div>

      <div className="relative z-10 flex flex-col items-center justify-between min-h-screen w-full max-w-6xl mx-auto px-4 py-8">
        {/* Header */}
        <header className="w-full pt-8 pb-4">
          <h1 className="text-4xl md:text-5xl font-bold text-center text-green-500 drop-shadow-lg">
            MySplashZones
          </h1>
        </header>

        {/* Main Content */}
        <main className="flex-1 flex flex-col items-center justify-center w-full gap-8 py-8">
          <div className="border-2 border-gray-800 bg-black/70 backdrop-blur-sm p-8 md:p-12 rounded-xl max-w-xl md:max-w-2xl mx-auto md:mr-auto md:ml-8">
            <h2 className="text-3xl md:text-5xl text-center md:text-left text-white font-semibold mb-6 drop-shadow-md">
             Your Personal Basketball Shot Tracker
            </h2>
            
            <p className="text-center md:text-left text-gray-200 text-xl mb-10 max-w-xl">
              Track your shots, analyze your performance, and improve your game with MySplashZones!
            </p>

            {/* Buttons */}
            <div className="flex flex-col sm:flex-row gap-6 w-full max-w-lg mx-auto md:mx-0">
              <button className="bg-blue-600 hover:bg-blue-700 text-white font-semibold py-4 px-8 rounded-lg shadow-lg transition duration-200 ease-in-out w-full text-lg">
                Sign Up
              </button>
              <button className="bg-white hover:bg-gray-100 text-blue-800 font-semibold py-4 px-8 rounded-lg shadow-lg transition duration-200 ease-in-out w-full text-lg">
                Log In
              </button>
            </div>
          </div>
        </main>

        {/* Footer */}
        <footer className="w-full py-4">
          <p className="text-center text-white/80 text-sm">
            &copy; {new Date().getFullYear()} MySplashZones. All rights reserved.
          </p>
        </footer>
      </div>
    </div>
  );
}
